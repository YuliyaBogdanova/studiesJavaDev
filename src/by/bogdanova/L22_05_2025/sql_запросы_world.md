### 0. Получить список всех стран с их столицами, континентами и языками
SELECT continent_name, capital, country_name, language_name  FROM continents cont
JOIN countries c ON cont.continent_id = c.continent_id
JOIN country_languages c_lg ON c.country_id = c_lg.country_id
JOIN languages lg ON c_lg.language_id = lg.language_id
WHERE c_lg.is_official;

### 1. Все страны с населением более 100 миллионов. Сортировка от крупных к менее.
SELECT *  FROM countries
WHERE population > 100000000
ORDER BY population DESC

### 2. Города с населением более 5 миллионов (не столицы).  Сортировка от крупных к менее.
SELECT *  FROM cities
WHERE population > 5000000
AND NOT is_capital
ORDER BY population DESC

### 3. Страны в Европе
SELECT *  FROM continents cont
JOIN countries c ON cont.continent_id = c.continent_id
WHERE continent_name = 'Europe'

### 4. Количество городов в каждой стране
SELECT cont.continent_name, COUNT(c.country_id) FROM countries c
JOIN continents cont ON c.continent_id = cont.continent_id
GROUP BY cont.continent_name

### 5. Все официальные языки в Швейцарии
SELECT continent_name, capital, country_name, language_name  FROM continents cont
JOIN countries c ON cont.continent_id = c.continent_id
JOIN country_languages c_lg ON c.country_id = c_lg.country_id
JOIN languages lg ON c_lg.language_id = lg.language_id
WHERE country_name = 'Switzerland'
AND
c_lg.is_official;

### 6. Достопримечательности культурного типа (Cultural)
SELECT * FROM landmarks
WHERE type = 'Cultural'

### 7. Среднее население городов по странам. 
### Сортировка от крупных к менее.
SELECT country_name, AVG(cit.population)  FROM  cities cit
JOIN countries con ON cit.country_id = con.country_id
GROUP BY country_name
ORDER BY AVG(cit.population)

### 8. Самые древние города (основаны до 1000 года) 
### Сортировка от древних к менее.
SELECT * FROM  cities cit
WHERE foundation_year < 1000
ORDER BY foundation_year DESC

### 9. Столицы с населением менее 1 миллиона
SELECT * FROM  cities cit
WHERE population < 1000000
AND is_capital

### 10. Языки, на которых говорят в Индии
SELECT country_name, language_name  FROM continents cont
JOIN countries c ON cont.continent_id = c.continent_id
JOIN country_languages c_lg ON c.country_id = c_lg.country_id
JOIN languages lg ON c_lg.language_id = lg.language_id
WHERE country_name = 'India'

### 11. Вывести топ-5 стран с самыми большими столицами по населению
SELECT country_name FROM countries cont
JOIN cities c ON cont.country_id = c.country_id
WHERE is_capital
ORDER BY c.population DESC
LIMIT 5

### 12. Подсчитать общее население каждого континента по странам
SELECT cont.continent_name, SUM(c.population) FROM continents cont
JOIN countries c ON cont.continent_id = c.continent_id
GROUP BY continent_name

### 13. Получить список всех стран с их столицами, 
### континентами и языками
SELECT country_name, capital, continent_name, language_name  FROM countries c
JOIN continents cont ON c.continent_id = cont.continent_id
JOIN country_languages c_lg ON c.country_id = c_lg.country_id
JOIN languages lg ON c_lg.language_id = lg.language_id
ORDER BY country_name, language_name

### 14. Найти страны, где английский язык является официальным
SELECT country_name, capital, continent_name, language_name, is_official  FROM countries c
JOIN continents cont ON c.continent_id = cont.continent_id
JOIN country_languages c_lg ON c.country_id = c_lg.country_id
JOIN languages lg ON c_lg.language_id = lg.language_id
WHERE language_name = 'English' and is_official

### 15. Получить список достопримечательностей с описанием и типом, 
### построенных до 1800 года
SELECT landmark_name, description, type  FROM landmarks
WHERE year_built < 1800

### 16. Найти страны с наибольшей площадью, входящие в топ-5
SELECT * FROM countries
ORDER BY area_sq_km DESC
LIMIT 5

### 17. Найти страны, где более 80% населения говорит 
### на официальном языке
SELECT country_name, capital, continent_name, language_name, c.population, is_official, percentage  FROM countries c
JOIN continents cont ON c.continent_id = cont.continent_id
JOIN country_languages c_lg ON c.country_id = c_lg.country_id
JOIN languages lg ON c_lg.language_id = lg.language_id
WHERE is_official
AND percentage > 80
ORDER BY percentage DESC

### 18. Вывести список всех стран с их крупнейшим городом


### 19. Найти топ-3 страны с наибольшей средней плотностью населения в их городах

### 20. Найти все континенты, где суммарное население стран больше 1 миллиарда, и вывести их страны

### 21. Найти страну с наибольшим количеством официальных языков

### 22.  Найти города с достопримечательностями, построенными до 1000 года, и отсортировать их по древности

### 23. Найти страны, у которых площадь меньше 1% от площади их континента






