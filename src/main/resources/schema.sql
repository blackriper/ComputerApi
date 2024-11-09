
CREATE TABLE company (
    id CHAR(36) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    founder VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE computer (
    id_computer CHAR(36) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    release_date DATE,
    ram VARCHAR(50),
    disk VARCHAR(50),
    os_system VARCHAR(255),
    company_id CHAR(36),
    FOREIGN KEY (company_id) REFERENCES company(id) ON DELETE CASCADE
);
