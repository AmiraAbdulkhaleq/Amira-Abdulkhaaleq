# Amira Abdulkhaleq
### This Challenge covers the following :
* Automating Facebook Registration and Login.
* Automating Best Buy APIs.
* Creating a test plan for LinkedIn.
* Reporting defects on LinkedIn.

# Facebook-automation-testing

This part is covering the registration and login automation test cases for Facebook using selenium.

## Installation

Use this command

```bash
pip install selenium
```

then follow this description https://selenium-python.readthedocs.io/installation.html<br/>
Make sure that you have python3 installed

## Usage

Open your text editor and include the files in it (fbAutomation.py, createData.json AND loginData.json)
Open terminal and write this command

```python
python fbAutomation.py
```

and check the results.

### Code Snippet

```python
        def test_login_blank_pass(self):
        self.name.send_keys(self.loginD["blnakN"])
        self.userpassword.send_keys(self.loginD["balnkPassword"])
        self.loginbutton.click()
        assert "The password that you've entered is incorrect." in self.driver.page_source
        
        def test_login_blank_email(self):
        self.name.send_keys(self.loginD["blankName"])
        self.userpassword.send_keys(self.loginD["blankP"])
        self.loginbutton.click()
        assert "The email address or phone number that you've entered doesn't match any account." in self.driver.page_source
```

#Best-Buy-APIs-Automation

This part is covering a list of automated test cases for the best buy APIs.

## Installation
I used [REST Assured](http://rest-assured.io/).
### Preconditions for REST Assured: 
* Java (version 6).
* Eclipse.
* Maven.
* TestNG.

### Maven Dependency
```<dependency>
  	<groupId>io.rest-assured</groupId>
  	<artifactId>rest-assured</artifactId>
  	<version>2.9.0</version>
  </dependency>
```
Check the pom file.

### Code Snippet

```Java
        @Test
	      public void create()
	      {
		        RequestSpecification request = RestAssured.given();
		        request.header("Content-Type","application/json");
		        JSONObject json = new JSONObject();
		        json.put("name", "TestProduct");
		        request.body(json.toJSONString());
		        Response response = request.post("http://localhost:3030/products");
		        int code = response.getStatusCode();
		        Assert.assertEquals(code, 201);
	      }
```
