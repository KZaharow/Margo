insert into person(benefit_document,
                   address_1,
                   address_2,
                   birthday,
                   email,
                   fired_date,
                   fired_document,
                   name,
                   hired_date,
                   hired_document,
                   is_benefit_person,
                   surname,
                   passport,
                   password,
                   patronymic,
                   phone_1,
                   phone_2,
                   role,
                   status)
values ('пенсионное уд. 4 от 01-01-20',
        'г.минск, ул.карла-маркса, 3-45',
        'г.минск, ул.карла-маркса, 3-45',
        '1984-07-26',
        'admin@mail.com',
        '2020-07-01',
        null,
        null,
        '2020-07-01',
        'договор купли-продажи от 10.06.2020',
        true,
        'иванов',
        'hb12345678 выдан центральным ровд г.минска 20-01-2020',
        '$2a$10$CFyb65uvxREdFZq21INAcOtnLgJomL6rYsndRQUptcz3UX5M2b/AO',
        'иванович',
        '+375293912358',
        '+375293912358',
        'USER',
        'ACTIVE'),
       ('-',
        'г.Гомель, ул.Советская, 30',
        'г.Гомель, ул.Советская, 30',
        '1988-02-23',
        'user@mail.com',
        '2020-07-01',
        null,
        null,
        '2020-07-01',
        'договор купли-продажи от 13.03.2021',
        true,
        'иванов',
        'hb123453248 выдан центральным ровд г.Гомеля 31-01-2011',
        '$2a$10$CFyb65uvxREdFZq21INAcOtnLgJomL6rYsndRQUptcz3UX5M2b/AO',
        'иванович',
        '+375293567567',
        '+375293956756',
        'USER',
        'ACTIVE');

insert into garage(id, description, is_private, square, owner_id)
values (1, '17', true, 18.7, 1),
       (2, '13', true, 18.7, 1),
       (3, '8', true, 21, 2),
       (4, '3', true, 21, 2);


insert into news(date, header, text, status)
values ('2022-12-11 10:00:01', 'Уборка снега', 'Силами ГПК провели уборку снега', true),
 ('2022-11-10', 'Уборка мусора', 'Силами ГПК провели уборку мусора', false),
 ('2022-09-13', 'Покраска забоа', 'Силами ГПК провели покраску забора', true),
 ('2022-12-11 10:01:00', 'Уборка снега', 'Силами ГПК провели уборку снега 0', true)
, ('2022-12-11 10:02:01', 'Уборка снега', 'Силами ГПК провели уборку снега 1', true)
, ('2022-12-11 10:03:02', 'Уборка снега', 'Силами ГПК провели уборку снега 2', true)
, ('2022-12-11 10:04:03', 'Уборка снега', 'Силами ГПК провели уборку снега 3', true)
, ('2022-12-11 10:05:04', 'Уборка снега', 'Силами ГПК провели уборку снега 4', true)
, ('2022-12-11 10:06:05', 'Уборка снега', 'Силами ГПК провели уборку снега 5', true)
, ('2022-12-11 10:07:06', 'Уборка снега', 'Силами ГПК провели уборку снега 6', true)
, ('2022-12-11 10:08:07', 'Уборка снега', 'Силами ГПК провели уборку снега 7', true)
, ('2022-12-11 10:09:08', 'Уборка снега', 'Силами ГПК провели уборку снега 8', true)
, ('2022-12-11 10:10:09', 'Уборка снега', 'Силами ГПК провели уборку снега 9', true)
, ('2022-12-11 10:11:010', 'Уборка снега', 'Силами ГПК провели уборку снега 10', true)
, ('2022-12-11 10:12:011', 'Уборка снега', 'Силами ГПК провели уборку снега 11', true)
, ('2022-12-11 10:13:012', 'Уборка снега', 'Силами ГПК провели уборку снега 12', true)
, ('2022-12-11 10:14:013', 'Уборка снега', 'Силами ГПК провели уборку снега 13', true)
, ('2022-12-11 10:15:014', 'Уборка снега', 'Силами ГПК провели уборку снега 14', true)
, ('2022-12-11 10:16:015', 'Уборка снега', 'Силами ГПК провели уборку снега 15', true)
, ('2022-12-11 10:17:016', 'Уборка снега', 'Силами ГПК провели уборку снега 16', true)
, ('2022-12-11 10:18:017', 'Уборка снега', 'Силами ГПК провели уборку снега 17', true)
, ('2022-12-11 10:19:018', 'Уборка снега', 'Силами ГПК провели уборку снега 18', true)
, ('2022-12-11 10:20:019', 'Уборка снега', 'Силами ГПК провели уборку снега 19', true)
, ('2022-12-11 10:21:020', 'Уборка снега', 'Силами ГПК провели уборку снега 20', true)
, ('2022-12-11 10:22:021', 'Уборка снега', 'Силами ГПК провели уборку снега 21', true)
, ('2022-12-11 10:23:022', 'Уборка снега', 'Силами ГПК провели уборку снега 22', true)
, ('2022-12-11 10:24:023', 'Уборка снега', 'Силами ГПК провели уборку снега 23', true)
, ('2022-12-11 10:25:024', 'Уборка снега', 'Силами ГПК провели уборку снега 24', true)
, ('2022-12-11 10:26:025', 'Уборка снега', 'Силами ГПК провели уборку снега 25', true)
, ('2022-12-11 10:27:026', 'Уборка снега', 'Силами ГПК провели уборку снега 26', true)
, ('2022-12-11 10:28:027', 'Уборка снега', 'Силами ГПК провели уборку снега 27', true)
, ('2022-12-11 10:29:028', 'Уборка снега', 'Силами ГПК провели уборку снега 28', true)
, ('2022-12-11 10:30:029', 'Уборка снега', 'Силами ГПК провели уборку снега 29', true)
, ('2022-12-11 10:31:030', 'Уборка снега', 'Силами ГПК провели уборку снега 30', true)
, ('2022-12-11 10:32:031', 'Уборка снега', 'Силами ГПК провели уборку снега 31', true)
, ('2022-12-11 10:33:032', 'Уборка снега', 'Силами ГПК провели уборку снега 32', true)
, ('2022-12-11 10:34:033', 'Уборка снега', 'Силами ГПК провели уборку снега 33', true)
, ('2022-12-11 10:35:034', 'Уборка снега', 'Силами ГПК провели уборку снега 34', true)
, ('2022-12-11 10:36:035', 'Уборка снега', 'Силами ГПК провели уборку снега 35', true)
, ('2022-12-11 10:37:036', 'Уборка снега', 'Силами ГПК провели уборку снега 36', true)
, ('2022-12-11 10:38:037', 'Уборка снега', 'Силами ГПК провели уборку снега 37', true)
, ('2022-12-11 10:39:038', 'Уборка снега', 'Силами ГПК провели уборку снега 38', true)
, ('2022-12-11 10:40:039', 'Уборка снега', 'Силами ГПК провели уборку снега 39', true)
, ('2022-12-11 10:41:040', 'Уборка снега', 'Силами ГПК провели уборку снега 40', true)
, ('2022-12-11 10:42:041', 'Уборка снега', 'Силами ГПК провели уборку снега 41', true)
, ('2022-12-11 10:43:042', 'Уборка снега', 'Силами ГПК провели уборку снега 42', true)
, ('2022-12-11 10:44:043', 'Уборка снега', 'Силами ГПК провели уборку снега 43', true)
, ('2022-12-11 10:45:044', 'Уборка снега', 'Силами ГПК провели уборку снега 44', true)
, ('2022-12-11 10:46:045', 'Уборка снега', 'Силами ГПК провели уборку снега 45', true)
, ('2022-12-11 10:47:046', 'Уборка снега', 'Силами ГПК провели уборку снега 46', true)
, ('2022-12-11 10:48:047', 'Уборка снега', 'Силами ГПК провели уборку снега 47', true)
, ('2022-12-11 10:49:048', 'Уборка снега', 'Силами ГПК провели уборку снега 48', true)
, ('2022-12-11 10:50:049', 'Уборка снега', 'Силами ГПК провели уборку снега 49', true)
, ('2022-12-11 10:51:050', 'Уборка снега', 'Силами ГПК провели уборку снега 50', true)
, ('2022-12-11 10:52:051', 'Уборка снега', 'Силами ГПК провели уборку снега 51', true)
, ('2022-12-11 10:53:052', 'Уборка снега', 'Силами ГПК провели уборку снега 52', true)
, ('2022-12-11 10:54:053', 'Уборка снега', 'Силами ГПК провели уборку снега 53', true)
, ('2022-12-11 10:55:054', 'Уборка снега', 'Силами ГПК провели уборку снега 54', true)
, ('2022-12-11 10:56:055', 'Уборка снега', 'Силами ГПК провели уборку снега 55', true)
, ('2022-12-11 10:57:056', 'Уборка снега', 'Силами ГПК провели уборку снега 56', true)
, ('2022-12-11 10:58:057', 'Уборка снега', 'Силами ГПК провели уборку снега 57', true)
, ('2022-12-11 10:59:058', 'Уборка снега', 'Силами ГПК провели уборку снега 58', true);