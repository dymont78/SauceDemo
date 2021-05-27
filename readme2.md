2.
[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   io.github.bonigarcia:webdrivermanager ................. 4.4.1 -> 4.4.3
[INFO]   org.seleniumhq.selenium:selenium-java ....... 3.141.59 -> 4.0.0-beta-3
[INFO]   org.testng:testng ..................................... 7.1.0 -> 7.4.0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  59.699 s
[INFO] Finished at: 2021-05-27T12:31:44+03:00
[INFO] ------------------------------------------------------------------------

D:\tms\SauceDemoVRC2>mvn versions:use-latest-versions
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< org.example:SauceDemo >------------------------
[INFO] Building SauceDemo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- versions-maven-plugin:2.8.1:use-latest-versions (default-cli) @ SauceDemo ---
[INFO] Major version changes allowed
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.669 s
[INFO] Finished at: 2021-05-27T12:34:53+03:00
[INFO] ------------------------------------------------------------------------

!!! Если версии зависимостей указаны через переменные в разделе <properties>, то зависимости не обновляются

D:\tms\SauceDemoVRC2>mvn versions:use-latest-versions
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< org.example:SauceDemo >------------------------
[INFO] Building SauceDemo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- versions-maven-plugin:2.8.1:use-latest-versions (default-cli) @ SauceDemo ---
[INFO] Major version changes allowed
[INFO] Updated org.testng:testng:jar:7.1.0 to version 7.4.0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.727 s
[INFO] Finished at: 2021-05-27T12:55:42+03:00
[INFO] ------------------------------------------------------------------------

3.
D:\tms\SauceDemoVRC2>mvn -Dtest=LoginTest#loginFactoryTest test
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< org.example:SauceDemo >------------------------
[INFO] Building SauceDemo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ SauceDemo ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory D:\tms\SauceDemoVRC2\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ SauceDemo ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ SauceDemo ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ SauceDemo ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ SauceDemo ---
[INFO] Surefire report directory: D:\tms\SauceDemoVRC2\target\surefire-reports

-------------------------------------------------------
T E S T S
-------------------------------------------------------
Running tests.LoginTest
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@6c629d6e
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 6300
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
ьр  27, 2021 2:47:45 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
======================================== STARTING TEST loginFactoryTest ========================================
======================================== FINISHED TEST loginFactoryTest Duration: 8s ========================================
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 41.896 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  53.503 s
[INFO] Finished at: 2021-05-27T14:47:59+03:00
[INFO] ------------------------------------------------------------------------

4.
D:\tms\SauceDemoVRC2>mvn -Dtest=CartTest -Dusername=standard_user -Dpassword=secret_sauce test
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< org.example:SauceDemo >------------------------
[INFO] Building SauceDemo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ SauceDemo ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory D:\tms\SauceDemoVRC2\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ SauceDemo ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ SauceDemo ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ SauceDemo ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ SauceDemo ---
[INFO] Surefire report directory: D:\tms\SauceDemoVRC2\target\surefire-reports

-------------------------------------------------------
T E S T S
-------------------------------------------------------
Running tests.CartTest
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@198e2867
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 27881
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
ьр  27, 2021 3:58:52 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
======================================== STARTING TEST initPages ========================================
======================================== FINISHED TEST initPages Duration: 0s ========================================
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 2099
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
ьр  27, 2021 3:59:17 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
======================================== STARTING TEST addProductToCartTest ========================================
======================================== FINISHED TEST addProductToCartTest Duration: 6s ========================================
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 52.278 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:08 min
[INFO] Finished at: 2021-05-27T15:59:26+03:00
[INFO] ------------------------------------------------------------------------

