# -Carbon---Android-
Automated test script of the carbon android app

step 1.
install node js

1. navigate to https://nodejs.org/en/download/
2. select the nodejs 32 bit installer if you hav a 32 bit computer otherwise select the 64 bit installer
3. run the installer when the download completes and follow the instructions

step 2
install appium
1. open a cmd line interface with admin privileges and type this at the prompt
	npm install -g appium
	
2. after that, run this command
	npm install -g appium-doctor

3. wait for the installer to finish the run this command to verify that all the dependencies have been correctly installed
	appium-doctor --android (for android)
	appium-doctor --ios (for ios)
	
Step 3.
Download Katalon Studio.
1. navigate to katalon.com and reister to download the software
2. extract the downloaded zip file to a preferred location
3. open the extracted folder and run Katalon.exe

Step 4.
Clone project into katalon studio

Step 5.
open android emulator with a device using android 6.0 and above

Step 6
Run the test suite.

