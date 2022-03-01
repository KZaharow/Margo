insert into Person (id, email, first_name, last_name, password, role, status)
values (1, 'admin@mail.com', 'admin', 'adminov', '$2a$12$dGzfjGCPuVosuHNsTiKsP.6oMjtAH6o9aJY1X6yqAxjXEykh2UdQq',
        'ADMIN', 'ACTIVE'),
       (2, 'user@mail.com', 'user', 'userov', '$2a$12$J8XgZwHnyQo/Td3y54R7Ouq/hmGgewxad2KMaRBJVt2qfsZHGGxO2', 'USER',
        'ACTIVE');