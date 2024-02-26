## **Java**
### **Окружение**
* https://www.oracle.com/java/technologies/javase/jdk20-archive-downloads.html - скачать и установить jdk
* https://www.jetbrains.com/ru-ru/idea/download/?section=windows - скачать и установить среду разработки для java

### **Как в idea включить утверждения:**
* edit configurations... -> modify options -> add VM options 
* build and run java 21(version) -> -ea
* apply
* ok

### **Подключение фреймворков и библиотек:**
* Скачать библиотеку -> File -> Project Structure... -> Module -> Dependencies -> Module SDK + -> JARs or Directories... -> выбрать скачанную библиотеку -> поставить галочку на появившейся в списке библиотеке
* apply
* ok

**### Создание отдельной директории для тестов**
* File -> Project Structure -> при выделенной папке src выбрать вкладку sorces, нажать правой кнопкой мыши на src -> new directory -> <test> -> ok
* Нажать правой кнопкой мыши на появившейся папке test и задать ее как папку для тестовых исходников: отметить галочкой на Tests

* Maven Repository: Search/Browse/Explore https://mvnrepository.com


## **Python**
### **Окружение**
* https://www.python.org - установить python
* https://www.jetbrains.com/pycharm/ - скачать среду разработки для python

### **Подключение фреймворков и библиотек:**
1. pip install flake8 - установка
* flake8 --version - проверка
* python.exe -m pip install --upgrade pip - обновление версии

* flake8 <название_файла> - проверить один файл
* flake8 <название_директории/> - проверить директорию рекурсивно
* flake8 . - проверить текущую директорию рекурсивно

* Существуют доп.плагины в т.ч. для линтера flake8 для расширения функциональности проверок

2. pip install pylint - установка
* pylint --version - проверка

* pylint <название_файла> - проверить один файл

3. pip install -U pytest - установка
* pytest --version - проверка

* File -> Settings -> Plugins -> SonarLint -> Install -> Accept -> Apply -> Ok