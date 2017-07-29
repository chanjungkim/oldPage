import requests
from bs4 import BeautifulSoup

from datetime import datetime

now = datetime.now()
file_path = datetime.strftime(now, "./menu.txt")

url = "http://www.scnu.ac.kr/mbs/dorm/"

response = requests.get(url)
soup = BeautifulSoup(response.text, 'html.parser')
menus = soup.select('div.todayMenu_list')
f = open(file_path, 'w', encoding='utf-8')
data = "%s" % menus
f.write(data)
f.close()