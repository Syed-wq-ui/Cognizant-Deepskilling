CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN

    UPDATE Accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'Savings';

    COMMIT;

END;
/

//scenario 2

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    p_department IN VARCHAR2,
    p_bonus IN NUMBER
)
AS
BEGIN

    UPDATE Employees
    SET salary = salary + (salary * p_bonus / 100)
    WHERE department = p_department;

    COMMIT;

END;
/

//scenario 3
CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_fromAccount IN NUMBER,
    p_toAccount IN NUMBER,
    p_amount IN NUMBER
)
AS

    v_balance NUMBER;

BEGIN

    SELECT balance
    INTO v_balance
    FROM Accounts
    WHERE account_id = p_fromAccount;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET balance = balance - p_amount
        WHERE account_id = p_fromAccount;

        UPDATE Accounts
        SET balance = balance + p_amount
        WHERE account_id = p_toAccount;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Transfer Successful');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

    END IF;

END;
/