# Проект по автоматизации тестирования 
## <a target="_blank" href="https://trashbox.ru/files20/1639225_a5b1ad/com.hitechrush.jaxarush_1.0.65_100065.apk">мобильного приложения JavaRush</a>

![This is an image](https://i.imgur.com/qonhbh0.png)

## :rocket: Содержание:

- [x] <a href="#rocket-технологии-и-инструменты">Технологии и инструменты</a>
- [x] <a href="#rocket-реализованные-проверки">Реализованные проверки</a>
- [x] <a href="#rocket-сборка-в-Jenkins">Сборка в Jenkins</a>
- [x] <a href="#rocket-запуск-из-терминала">Запуск из терминала</a>
- [x] <a href="#rocket-allure-отчет">Allure отчет</a>
- [x] <a href="#rocket-интеграция-с-allure-testops">Интеграция с Allure TestOps</a>
- [x] <a href="#rocket-интеграция-с-jira">Интеграция с Jira</a>
- [x] <a href="#rocket-отчет-в-telegram">Отчет в Telegram</a>
- [x] <a href="#rocket-Результаты-тестов-в-BrowserStack">Результаты тестов в BrowserStack</a>
- [x] <a href="#rocket-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :rocket: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Android Studio" src="images/logo/android-studio.svg">
<img width="6%" title="Appium" src="images/logo/appium.svg">
<img width="6%" title="BrowserStack" src="images/logo/browserstack.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="AllureTestOps" src="images/logo/AllureTestOps.svg">
<img width="6%" title="Git" src="images/logo/Git.svg">
<img width="6%" title="RestAssured" src="images/logo/RestAssured.svg">
<img width="6%" title="Jira" src="images/logo/Jira.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :rocket: Реализованные проверки
![This is an image](https://i.imgur.com/Dd62Cq5.png)
- Проверка информации на страницах обучения
- Проверка элементов главной страницы
- Проверка отображения элементов титульной страницы
- Проверка отображения элементов страницы с выбором языка
- Проверка отображения элементов страницы выбора профессии

## :rocket: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/Lesson_20_mobile_tests_part2/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/jenkins_dashboard.png">
</p>

### Параметры сборки в Jenkins:
Сборка в Jenkins

- устройство, по умолчанию Pixel 4 API 30
- версия ОС, по умолчанию Android 11.0

## :rocket: Запуск из терминала
Локальный запуск:
```
gradle clean android -Dhost=(browserStack/realDevice/androidEmulator)
```

Удаленный запуск:
```
clean
android
"-Dhost=${HOST}"
```

## :rocket: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/report_main_page.png">
</p>

- ### Проведенные тесты (suites)
<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure_suites_1.png">
<img title="Allure Test Page" src="images/screenshots/allure_suites_2.png">
<img title="Allure Test Page" src="images/screenshots/allure_suites_3.png">
</p>

- ### Пакеты тестов
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_packages.png">
</p>

- ### График прохождения тестов
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_schedule.png">
</p>

## :rocket: Результаты тестов в BrowserStack
- ### Как можно загрузить свое приложение
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/upload_file_BS.png">
</p>

- ### Как можно увидеть процесс запуска тестов
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/your_test_run_BS.png">
</p>

- ### Параметры необходимых для запуска тестов
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/input_capabilities_BS.png">
</p>

- ### Текстовые логи в BrowserStack
<p align="center">
<img title="TestOps tests page" src="images/screenshots/text_logs_BS.png">
</p>

- ### Логи устройства в BrowserStack
<p align="center">
<img title="TestOps tests page" src="images/screenshots/device_capabilities_other_logs_BS.png">
</p>

- ### Состояние устройства в BrowserStack
<p align="center">
<img title="TestOps tests page" src="images/screenshots/app_profiling_BS.png">
</p>

## :rocket: Интеграция с Allure TestOps
- ### Результаты запуска тестов
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/test_results_ATO.png">
</p>

- ### Выводом ошибок после запуска тестов
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/test_errors_ATO.png">
</p>

- ### Launches после интеграции с IDE + график
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/launches_ATO.png">
</p>

- ### Дашборды с ручными и авто тестами
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/dashboards_ATO.png">
</p>

- ### Тест кейсы
<p align="center">
<img title="TestOps tests page" src="images/screenshots/test_cases_ATO.png">
</p>

- ### Запуски с ручными и авто тестами
<p align="center">
<img title="TestOps tests page" src="images/screenshots/test_runs_ATO.png">
</p>

## :rocket: Интеграция с Jira
- ### Задача в Jira
<p align="center">
<img title="Jira issue" src="images/screenshots/jira_task.png">
</p>

## :rocket: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/screenshots/telegram_report.png">
</p>

Локальный запуск:
```
java "-DconfigFile=notifications/telegram.json" -jar allure-notifications-4.2.0.jar

```

## :rocket: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gifs/test_result.gif">
</p>



