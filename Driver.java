package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Driver {

	public final static int STANDARD_IR_VALUE = 20;
	public final static int STANDARD_LASER_VALUE = 120;
	public final static int STANDARD_ULTRASONIC_VALUE = 120;
	public final static int STANDARD_GYRO_VALUE = 0;
	public final static double STANDARD_GPS_DELTA = 0.00001208215;
	public final static double STANDARD_GPS_ERROR = 0.00005491891;
	public final static double INIT_LAT = 21.5613248;
	public final static double INIT_LONG = -90.11356155;
	
	public static void main(String[] args) throws IOException {
		Random random = new Random();
		FileWriter gyroOutputStream = new FileWriter("/home/apollo/dummydata/gyrodummydata");
		FileWriter rightultrasonicOutputStream = new FileWriter("/home/apollo/dummydata/rightultasonicdummydata");
		FileWriter leftultrasonicOutputStream = new FileWriter("/home/apollo/dummydata/leftultasonicdummydata");
		FileWriter rightlaserOutputStream = new FileWriter("/home/apollo/dummydata/rightlaserdummydata");
		FileWriter leftlaserOutputStream = new FileWriter("/home/apollo/dummydata/leftlaserdummydata");
		FileWriter gpsOutputStream = new FileWriter("/home/apollo/dummydata/gpsdummydata");
		FileWriter irrightOutputStream = new FileWriter("/home/apollo/dummydata/irrightdummydata");
		FileWriter irleftOutputStream = new FileWriter("/home/apollo/dummydata/irleftdummydata");
		double currentLat = INIT_LAT;
		double currentLong = INIT_LONG;
		
		//Normal operation
		for (int i = 0; i < 40; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//intersection
		for (int i = 0; i < 12; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(255 + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(255 + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(255 + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(255 + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//normal operation
		for (int i = 0; i < 68; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//turn right
		for (int i = 0; i < 20; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(10 + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//normal operation
		for (int i = 0; i < 30; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			currentLong -= STANDARD_GPS_DELTA;		gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLat += STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//intersection
		for (int i = 0; i < 14; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(255 + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(255 + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(255 + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(255 + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLat += STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//normal operation
		for (int i = 0; i < 60; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			currentLong -= STANDARD_GPS_DELTA;		gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLat += STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//narrow road
		for (int i = 0; i < 35; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(45 + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(65 + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(50 + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(50 + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			currentLong -= STANDARD_GPS_DELTA;		gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLat += STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
			
		}
		//turn left
		for (int i = 0; i < 25; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(-12 + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//normal operation
		for (int i = 0; i < 50; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//crosswalk
		for (int i = 0; i < 6; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(100 + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(80 + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//normal operation
		for (int i = 0; i < 60; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//speed bump
		for(int i = 0; i < 4; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(2 + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(60 + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(60 + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//normal operation
		for (int i = 0; i < 10; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//intersection/narrow road combo
		for (int i = 0; i < 30; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(255 + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(45 + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(255 + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(50 + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		//normal operation
		for (int i = 0; i < 10; i++) {
			boolean isNegative = random.nextBoolean();
			gyroOutputStream.write(Integer.toString(STANDARD_GYRO_VALUE + ((random.nextInt() % 5))*(isNegative ? -1 : 1)));
			
			isNegative = random.nextBoolean();
			rightultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftultrasonicOutputStream.write(Integer.toString(STANDARD_ULTRASONIC_VALUE + ((random.nextInt() % 15)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			rightlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			leftlaserOutputStream.write(Integer.toString(STANDARD_LASER_VALUE + ((random.nextInt() % 10)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			boolean isNegativeLong = random.nextBoolean();
			gpsOutputStream.write(Double.toString(currentLat + (STANDARD_GPS_ERROR * (isNegative ? -1 : 1))) + " " + 
			Double.toString(currentLong + (STANDARD_GPS_ERROR * (isNegativeLong ? -1 : 1))));
			currentLong -= STANDARD_GPS_DELTA;
			
			isNegative = random.nextBoolean();
			irrightOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			isNegative = random.nextBoolean();
			irleftOutputStream.write(Integer.toString(STANDARD_IR_VALUE + ((random.nextInt() % 5)*(isNegative ? -1 : 1))));
			
			gyroOutputStream.write("\n");
			rightultrasonicOutputStream.write("\n");
			leftultrasonicOutputStream.write("\n");
			rightlaserOutputStream.write("\n");
			leftlaserOutputStream.write("\n");
			gpsOutputStream.write("\n");
			irrightOutputStream.write("\n");
			irleftOutputStream.write("\n");
		}
		gyroOutputStream.close();
		rightultrasonicOutputStream.close();
		leftultrasonicOutputStream.close();
		rightlaserOutputStream.close();
		leftlaserOutputStream.close();
		gpsOutputStream.close();
		irrightOutputStream.close();
		irleftOutputStream.close();
	}

}
