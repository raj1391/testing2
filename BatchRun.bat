set projectLocation=C:\Users\VAIO\eclipse-workspace\PomProject\src\test\java

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml

pause