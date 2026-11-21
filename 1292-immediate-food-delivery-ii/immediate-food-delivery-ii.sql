SELECT ROUND(COALESCE((COUNT(CUSTOMER_ID)/
                                        (SELECT COUNT(*)
                                        FROM DELIVERY D1
                                        WHERE D1.ORDER_DATE=(SELECT MIN(ORDER_DATE)
                                        FROM DELIVERY D2
                                        WHERE D1.CUSTOMER_ID=D2.CUSTOMER_ID))
                                        )*100,0),2) AS IMMEDIATE_PERCENTAGE
FROM DELIVERY D1
WHERE D1.ORDER_DATE=(SELECT MIN(ORDER_DATE)
                    FROM DELIVERY D2
                    WHERE D1.CUSTOMER_ID=D2.CUSTOMER_ID)
AND D1.customer_pref_delivery_date=D1.ORDER_DATE;
