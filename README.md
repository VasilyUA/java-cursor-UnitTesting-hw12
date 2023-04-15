# Cursor current Task:

```agsl
CURSOR.EDUCATION
Java AdvancedApril 14, 2023
Unit Testing



Написати додаток по наступному ТЗ:
Додаток "Продуктовий магазин". 
Кожен продукт у магазині має свою ціну. 
Є також товари, котрим передбачена акційна ціна N кількості. 
Наприклад, 1 яблуко коштує 1$, 6 яблук коштують 5$. 
Кожен продукт має свій код - букву англійського алфавіту.

Необхідно розрахувати вартість кошика з урахуванням можливих знижок.

На даний момент "склад" магазину та розцінки виглядають наступним чином:



Товар      Ціна (за 1 шт).     Акційна кількість          Акційна ціна

    A            1,25                                 3                                  3.00

    B           4.25                                  -                                     -

    C           1.00                                 6                                   5.00

   D            0.75                                 -                                      -



Технічні вимоги:
Використання БД опційно, можна зберігати дані в будь-якому зручному для вас вигляді

Особливості внутрішньої реалізації – на розсуд студента

На виході очікується отримати метод, який можна викликати з main, передати туди рядок із “кошиком” і який поверне вартість цього кошика.

Приклад:
calculateTotalCost(“ABCDABA”) return 13,25 (3*A - 3.00 за акцією, 2*В = 8,50, 1*С = 1,00, 1*D = 0,75 => 3 + 8,5 + 1 + 0,75 = 13.25)





Покрити програму тестами

Викласти проект на Git репозиторій
```