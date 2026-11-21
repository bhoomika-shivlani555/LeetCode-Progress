WITH TEMP_TABLE AS
(
    SELECT *
    FROM DELIVERY D1
    WHERE D1.ORDER_DATE=(SELECT MIN(ORDER_DATE)
                        FROM DELIVERY D2
                        WHERE D1.CUSTOMER_ID=D2.CUSTOMER_ID)
)
SELECT ROUND(COALESCE((COUNT(CUSTOMER_ID)/
                                        (SELECT COUNT(*)
                                        FROM TEMP_TABLE)
                                        )*100,0),2) AS IMMEDIATE_PERCENTAGE
FROM TEMP_TABLE
WHERE customer_pref_delivery_date=ORDER_DATE;
