<%
ID = request("ID")
NAME = request("NAME")
AGE = request("AGE")
SEX = request("SEX")
response.cookies("_USERID_") = ID
response.cookies("_NAME_")   = NAME
response.cookies("_AGE_")    = AGE
response.cookies("_SEX_")    = SEX

response.redirect "./index.asp"

%>