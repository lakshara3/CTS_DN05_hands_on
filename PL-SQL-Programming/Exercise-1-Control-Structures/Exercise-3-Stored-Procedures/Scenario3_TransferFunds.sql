SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_from_account NUMBER,
    p_to_account NUMBER,
    p_amount NUMBER
)
AS

    v_balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;


    IF v_balance >= p_amount THEN


        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from_account;


        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to_account;


        DBMS_OUTPUT.PUT_LINE('Transfer Successful');

        COMMIT;


    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

    END IF;


END;
/