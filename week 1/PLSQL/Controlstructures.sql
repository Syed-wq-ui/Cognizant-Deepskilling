//Scenario 1

DECLARE

BEGIN

    FOR C IN (SELECT customer_id,age,interest_rate FROM Customers)
    LOOP
        IF C.age>60 THEN
            UPDATE Customers
            SET interest_rate = interest_rate - 1
            WHERE customer_id = C.customer_id;
        END IF; 
    END LOOP;
END;
/           

//Scenario 2
DECLARE

BEGIN
    FOR C IN (SELECT customer_id,balance from customers)
    LOOP
        if c.balance>10000 Then
            update Customers
            set isvip=TRUE
            where customer_id=c.customer_id;
        END IF;
    END LOOP;
END;
/

\\SCENARIO 3
DECLARE
BEGIN
    FOR C IN (SELECT customer_id,due_date from loans
    where due_date<=sysdate+30)
    loop
      DBMS_OUTPUT.PUT_LINE('REMINDER sent to customer '||C.customer_id||' for loan due on '||C.due_date);
    end loop;
end;
/      