CREATE TABLE users(
    seq bigint NOT NULL AUTO_INCREMENT,
    email varchar(50) NOT NULL,
    passwd varchar(80) NOT NULL,
    login_count int NOT NULL DEFAULT 0,
    last_login_at datetime DEFAULT NULL,
    create_at datetime NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    PRIMARY KEY (seq),
    CONSTRAINT unq_user_email UNIQUE(email)
);

CREATE TABLE TEST(
    ID INT PRIMARY KEY,
    NAME VARCHAR(255));
);

INSERT INTO TEST VALUES(1, 'Hello');
INSERT INTO TEST VALUES(2, 'World');