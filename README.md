# Carefer-Task
# Rest-Assured for API Automation testing

Used tools and frameworks
---------------------------------------
1. Rest-Assured
2. Maven repository 
3. TestNG
4. Page object model design pattern



Main features
----------------------------
1. Hybrid framework to test automation APIs. 
2. Supports REST APIs testing. 
3. All classes and methods are implemented in Java with Maven repository to include all dependencies needed.
4. every request body of APis exist json files in resourses folder.
5. Apis test cases are existing in test cases folder.
6. The framework validates the returned status code, response body. It can validate each field data type and value. If the returned response includes object of arraylist.
7. Source code is available here: https://github.com/ymhmd/buenoAPI-SourceCode


Tools versions 
-----------------------------
1. Rest-Assured : 4.4.0
2. testng : 7.7.0

Apis used in this task
-----------------------------
1.Register API

- Base Url : https://provider.test.carefer.co/api/provider
- Headers:

![image](https://user-images.githubusercontent.com/53869077/210053175-757b2c6a-d6bd-43b8-91ee-d4cc51db0e52.png)
- Register Api URL : /v1/auth/register
- Register Request body example:
```
{
"password": "123456",
"password_confirmation": "123456",
"favorite_language": "en",
"responsible_person": "Test_Automation",
"is_accept_terms_and_conditions": true,
"name": "Test_Automation Name",
"mobile": 966556677888,
"email": "Test_Automation@gmail.com"
}
```


2.Verify API

- Base Url : https://provider.test.carefer.co/api/provider
- Headers:

![image](https://user-images.githubusercontent.com/53869077/210053175-757b2c6a-d6bd-43b8-91ee-d4cc51db0e52.png)
- Verify Api URL : /v1/auth/verify
- Verify Request body example:
```
{
"mobile": 966556677888,
"verification_code": 9531
}

```


3.Login API

- Base Url : https://provider.test.carefer.co/api/provider
- Headers:

![image](https://user-images.githubusercontent.com/53869077/210053175-757b2c6a-d6bd-43b8-91ee-d4cc51db0e52.png)
- Login Api URL : /v1/auth/login
- Login Request body example:
```
{
"mobile": 966556677888,
"verification_code": 9531
}

```

