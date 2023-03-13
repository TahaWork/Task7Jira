Данный проект содержит тесты работающие с API
Запуск тестов производится через терминал командой mvn test
Для очистки предыдущих результатов перед запуском используйте mvn clean test

В файле pom.xml бфлв изменена версия maven-surefire-plugin с 2.20 на 2.22.2

В application.properties используется кириллица, поэтому кодировка файла UTF-8
Если кириллица не читается корректно необходимо проверить настройки в
File-settings-Editor-File encodings и установить галочку Transparent native-to-ascii conversion.

