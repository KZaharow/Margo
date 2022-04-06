insert into Person (id, email, password, firstName, lastName, patronymic, birthday, passport, garages, address1,
                    address2, hiredDate, hiredDocument, firedDate, firedDocument, isBenefitPerson, firedDocument, roles,
                    status)
values (1,
        'admin@mail.com',
        '$2a$12$dGzfjGCPuVosuHNsTiKsP.6oMjtAH6o9aJY1X6yqAxjXEykh2UdQq',
        'Иван',
        'Иванов',
        'Иванович',
        1984-07-26,
        ),
       (2, 'user@mail.com', 'user', 'userov', '$2a$12$J8XgZwHnyQo/Td3y54R7Ouq/hmGgewxad2KMaRBJVt2qfsZHGGxO2', 'USER',
        'ACTIVE');

/*// @Id
    (id, email, password, firstName, lastName, patronymic, birthday, passport, garages, address1, address2,
  hiredDate, hiredDocument, firedDate, firedDocument, isBenefitPerson, firedDocument, roles, status)