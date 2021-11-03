# TestC
Thank you for choosing Test Classes




**INSTALLATION**<br>
Please make sure the release file is unpacked a Web-accessible directory.
You will see the following files and directories: <br>

supercat1/ | package
--- | ---
Main1 | start app
Cat1 | Entity
Print | Interface
supercat2/ | package
Main2 | start app
MyOperation | Interface
README | this file





**REQUIREMENTS**<br>

The minimum requirement by TestC is your PC have Windows 10


The minimum requirement by supercat1 is that your PC has Windows and Linux operating systems.<br>


**BUILDING THE RUNNABLE JAR FILE**


 Steps for supercat1:
1) Go to the folder on the command line where our application is located, Compile on the command line and write the path to the library :
javac supercat1\*.java -cp lib\libname.jar -d out\
2) Create file manifest.txt and write path to main class: Main-Class: supercat1.Main1
3) Create jar file: jar -cfm supercat1.jar manifest.txt out\supercat1\
4) Go to the folder where our file supercat1.jar is located (in our example - folder out)
5) Specify the path to manifest.txt: jar -cfm supercat1.jar ..\manifest.txt supercat1\  

Steps for supercat2:
1) Go to the folder on the command line where our application is located, Compile on the command line and write the path to the library :
   javac supercat2\*.java -cp lib\libname.jar -d out\
2) Create file manifest.txt and write path to main class: Main-Class: supercat2.Main2
3) Create jar file: jar -cfm supercat2.jar manifest.txt out\supercat2\
4) Go to the folder where our file supercat2.jar is located (in our example - folder out)
5) Specify the path to manifest.txt: jar -cfm supercat2.jar ..\manifest.txt supercat2\


   **QUICK START**


On command line, supercat1 start with following commands:

java -jar supercat1.jar       (Windows)
<br>

On command line, supercat2 start with following commands:

java -jar supercat2.jar       (Windows)

