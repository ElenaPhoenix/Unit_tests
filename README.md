### Как в idea включить утверждения:

edit configurations... -> modify options -> add VM options 
build and run java 21(version) -> -ea
apply
ok

### Подключение библиотеки:
Скачать библиотеку -> File -> Project Structure... -> Module -> Dependencies -> Module SDK + -> JARs or Directories... -> выбрать скачанную библиотеку -> поставить галочку на появившейся в списке библиотеке
apply
ok

### Создание отдельной директории для тестов
File -> Project Structure -> при выделенной папке src выбрать вкладку sorces, нажать правой кнопкой мыши на src -> new directory -> <test> -> ok
Нажать правой кнопкой мыши на появившейся папке test и задать ее как папку для тестовых исходников: отметить галочкой на Tests



Maven Repository: Search/Browse/Explore https://mvnrepository.com



