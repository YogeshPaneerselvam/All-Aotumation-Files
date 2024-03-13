package com.base;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.Registry;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

//This declares the BaseClass which extends the ScreenRecorder class.
public class BaseClass extends ScreenRecorder {

	/* These declare fields screenRecorder of type ScreenRecorder and name of type
	 String.*/
	public static ScreenRecorder screenRecorder;
	public String name;

	/* This is the constructor method for BaseClass which initializes its fields and
	 calls the superclass constructor.*/
	public BaseClass(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat, Format screenFormat,
			Format mouseFormat, Format audioFormat, File movieFolder, String name) throws IOException, AWTException {

		super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);

		this.name = name;
	}

	/* This method overrides the createMovieFile method from the superclass to
	create a file for storing the recorded screen video*/
	@Override
	protected File createMovieFile(Format fileFormat) throws IOException {

		//Checks if the directory specified by movieFolder does not exist.
		if (!movieFolder.exists()) {

			/*Creates the directory if it doesn't exist. 
			The mkdirs() method creates both the directory and any necessary parent directories.*/
			movieFolder.mkdirs();

			//Checks if the specified path exists but is not a directory.
		} else if (!movieFolder.isDirectory()) {

			//Throws an IOException with a message indicating that the path is not a directory.
			throw new IOException("\"" + movieFolder + "\" is not a directory.");
		}

		//Creates a date format string.
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		return new File(movieFolder,
				name + "-" + dateFormat.format(new Date()) + "." + Registry.getInstance().getExtension(fileFormat));
	}

	// This method starts the screen recording.
	public static void startRecord(String methodName) throws Exception {

		//object representing the directory where recorded videos will be saved.
		File file = new File("./test-recordings/");

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		int width = screenSize.width;
		int height = screenSize.height;

		//representing the area of the screen to be captured during recording.
		Rectangle captureSize = new Rectangle(0, 0, width, height);

		
		/*It gets the default graphics configuration for the local graphics
		 environment, which includes information about the screen device and its
		 configuration.*/
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()
				.getDefaultConfiguration();

		//Sets up a screen recorder instance with specified parameters.
		screenRecorder = new BaseClass(gc, captureSize, new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
						CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
						Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
				null, file, methodName);

		//starts the screen recording process.
		screenRecorder.start();
	}

	// This method stops the screen recording.
	public static void stopRecord() throws Exception {
		screenRecorder.stop();
	}

}
