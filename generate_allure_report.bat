@echo off
:: If you already have a valid JAVA_HOME environment variable set, feel free to comment the below two lines
set JAVA_HOME=C:\Program Files\Java\jdk-21.0.7
set path=%JAVA_HOME%\bin;%path%
set path=C:\Users\salah swidan\.m2\repository\allure\allure-2.33.0\bin;%path%
allure serve allure-results -h localhost
pause
exit