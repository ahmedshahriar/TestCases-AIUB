# TestCases-AIUB
A collection of test cases and automation script made with java and selenium to test the [AIUB](https://www.aiub.edu) website.

## Authors

* **HUDA,FARIHA ROWSHAN**  - [fariharaushan3303](https://github.com/fariharaushan3303)
* **SAKIB,AHMED SHAHRIAR**  - [ahmedshahriar](https://github.com/ahmedshahriar)

## Prerequisites
* [Java 1.8](https://www.java.com/en/download/) - Core language
* [Firefox Browser](https://www.mozilla.org/en-US/firefox/download/) - Mozilla Firefox browser to test the script
* [xPath Finder](https://addons.mozilla.org/en-US/firefox/addon/xpath_finder/) - Mozilla Add on to find xPath
* [Selenium webdriver](https://bit.ly/2zm3ZzF) - Selenium for java
* [geckodriver](https://github.com/mozilla/geckodriver/releases) - geckodriver to work with Mozilla Firefox browser
* [eclipse](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-06/R/eclipse-cpp-2019-06-R-win32-x86_64.zip) - java IDE

## Notes
* Make sure your java compiler's compliance level is 1.8

![alt_text](https://github.com/ahmedshahriar/TestCases-AIUB/blob/master/screenshots/java_version.png "java compliance level")


* Add selenium external library to the project and apply the change

![alt text](https://github.com/ahmedshahriar/TestCases-AIUB/blob/master/screenshots/selenium_lib.png "selenium ext library")


* Make sure you put the correct path (Go to 25th line) in [main.java](https://github.com/ahmedshahriar/TestCases-AIUB/blob/master/Test/src/Main.java) , It will be replaced by your **geckodriver.exe** path

```java
System.setProperty("webdriver.gecko.driver", "C:\\Users\\H311812Z3R\\eclipse-workspace\\Test\\lib\\geckodriver\\geckodriver.exe");
```
