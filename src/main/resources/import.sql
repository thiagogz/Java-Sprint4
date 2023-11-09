-- INSERTS TB Cliente
INSERT INTO tb_hl_cliente (id_cliente, nome_cliente, senha_cliente, endereco_cliente, telefone_cliente, tipo_cliente, cpf_cnpj_cliente) VALUES (1, 'João da Silva', 'senha123', 'Rua A, 123', 12345678901, 'Pessoa Física', '123.456.789-01');
INSERT INTO tb_hl_cliente (id_cliente, nome_cliente, senha_cliente, endereco_cliente, telefone_cliente, tipo_cliente, cpf_cnpj_cliente) VALUES (2, 'Maria Souza', 'senha456', 'Avenida X, 456', 98765432109, 'Pessoa Física', '987.654.321-09');
INSERT INTO tb_hl_cliente (id_cliente, nome_cliente, senha_cliente, endereco_cliente, telefone_cliente, tipo_cliente, cpf_cnpj_cliente) VALUES (3, 'Empresa ABC', 'senha789', 'Rua B, 789', 1122334455, 'Pessoa Jurídica', '12.345.678/0001-00');
INSERT INTO tb_hl_cliente (id_cliente, nome_cliente, senha_cliente, endereco_cliente, telefone_cliente, tipo_cliente, cpf_cnpj_cliente) VALUES (4, 'José Oliveira', 'senhaabc', 'Rua C, 567', 5544332211, 'Pessoa Física', '554.433.221-11');
INSERT INTO tb_hl_cliente (id_cliente, nome_cliente, senha_cliente, endereco_cliente, telefone_cliente, tipo_cliente, cpf_cnpj_cliente) VALUES (5, 'Empresa XYZ', 'senhaxyz', 'Avenida Y, 987', 9988776655, 'Pessoa Jurídica', '99.887.766/0001-00');
INSERT INTO tb_hl_cliente (id_cliente, nome_cliente, senha_cliente, endereco_cliente, telefone_cliente, tipo_cliente, cpf_cnpj_cliente) VALUES (6, 'Ana Pereira', 'senha456', 'Rua D, 987', 1122334455, 'Pessoa Física', '112.233.445-55');
INSERT INTO tb_hl_cliente (id_cliente, nome_cliente, senha_cliente, endereco_cliente, telefone_cliente, tipo_cliente, cpf_cnpj_cliente) VALUES (7, 'Empresa QRS', 'senhaqrs', 'Avenida Z, 234', 1234567890, 'Pessoa Jurídica', '12.345.678/0001-01');
INSERT INTO tb_hl_cliente (id_cliente, nome_cliente, senha_cliente, endereco_cliente, telefone_cliente, tipo_cliente, cpf_cnpj_cliente) VALUES (8, 'Pedro Torres', 'senhaxyz', 'Rua M, 741', 1236547891, 'Pessoa Física', '748.456.123-00');

-- INSERTS TB Empresa
INSERT INTO tb_hl_empresa (id_empresa, nome_empresa, telefone_empresa) VALUES (1, 'Empresa A', 111111111);
INSERT INTO tb_hl_empresa (id_empresa, nome_empresa, telefone_empresa) VALUES (2, 'Empresa B', 222222222);
INSERT INTO tb_hl_empresa (id_empresa, nome_empresa, telefone_empresa) VALUES (3, 'Empresa C', 333333333);
INSERT INTO tb_hl_empresa (id_empresa, nome_empresa, telefone_empresa) VALUES (4, 'Empresa D', 444444444);
INSERT INTO tb_hl_empresa (id_empresa, nome_empresa, telefone_empresa) VALUES (5, 'Empresa E', 555555555);
INSERT INTO tb_hl_empresa (id_empresa, nome_empresa, telefone_empresa) VALUES (6, 'Empresa F', 666666666);
INSERT INTO tb_hl_empresa (id_empresa, nome_empresa, telefone_empresa) VALUES (7, 'Empresa G', 777777777);
INSERT INTO tb_hl_empresa (id_empresa, nome_empresa, telefone_empresa) VALUES (8, 'Empresa h', 888888888);

-- INSERTS TB Funcionario
INSERT INTO tb_hl_funcionario (id_funcionario, nome_funcionario, telefone_funcionario) VALUES (1, 'Funcionário 1', 111111111);
INSERT INTO tb_hl_funcionario (id_funcionario, nome_funcionario, telefone_funcionario) VALUES (2, 'Funcionário 2', 222222222);
INSERT INTO tb_hl_funcionario (id_funcionario, nome_funcionario, telefone_funcionario) VALUES (3, 'Funcionário 3', 333333333);
INSERT INTO tb_hl_funcionario (id_funcionario, nome_funcionario, telefone_funcionario) VALUES (4, 'Funcionário 4', 444444444);
INSERT INTO tb_hl_funcionario (id_funcionario, nome_funcionario, telefone_funcionario) VALUES (5, 'Funcionário 5', 555555555);
INSERT INTO tb_hl_funcionario (id_funcionario, nome_funcionario, telefone_funcionario) VALUES (6, 'Funcionário 6', 666666666);
INSERT INTO tb_hl_funcionario (id_funcionario, nome_funcionario, telefone_funcionario) VALUES (7, 'Funcionário 7', 777777777);

-- INSERTS TB Modal
INSERT INTO tb_hl_modal (id_modal, categoria_modal, tipo_modal, limite_altura, limite_comprimento, limite_peso, limite_largura) VALUES (1, 'Categoria A', 'Tipo X', 2.5, 5.0, 5000, 2.0);
INSERT INTO tb_hl_modal (id_modal, categoria_modal, tipo_modal, limite_altura, limite_comprimento, limite_peso, limite_largura) VALUES (2, 'Categoria B', 'Tipo Y', 2.0, 4.5, 4000, 1.8);
INSERT INTO tb_hl_modal (id_modal, categoria_modal, tipo_modal, limite_altura, limite_comprimento, limite_peso, limite_largura) VALUES (3, 'Categoria C', 'Tipo Z', 2.8, 5.5, 6000, 2.2);
INSERT INTO tb_hl_modal (id_modal, categoria_modal, tipo_modal, limite_altura, limite_comprimento, limite_peso, limite_largura) VALUES (4, 'Categoria A', 'Tipo X', 2.5, 5.0, 5000, 2.0);
INSERT INTO tb_hl_modal (id_modal, categoria_modal, tipo_modal, limite_altura, limite_comprimento, limite_peso, limite_largura) VALUES (5, 'Categoria B', 'Tipo Y', 2.0, 4.5, 4000, 1.8);
INSERT INTO tb_hl_modal (id_modal, categoria_modal, tipo_modal, limite_altura, limite_comprimento, limite_peso, limite_largura) VALUES (6, 'Categoria C', 'Tipo Z', 2.8, 5.5, 6000, 2.2);
INSERT INTO tb_hl_modal (id_modal, categoria_modal, tipo_modal, limite_altura, limite_comprimento, limite_peso, limite_largura) VALUES (7, 'Categoria D', 'Tipo W', 3.0, 6.0, 7000, 2.5);

-- INSERTS TB Empresa Funcionario
INSERT INTO tb_hl_empresa_funcionario (id_empresa_funcionario, id_empresa, id_funcionario) VALUES (1, 1, 1);
INSERT INTO tb_hl_empresa_funcionario (id_empresa_funcionario, id_empresa, id_funcionario) VALUES (2, 2, 2);
INSERT INTO tb_hl_empresa_funcionario (id_empresa_funcionario, id_empresa, id_funcionario) VALUES (3, 3, 3);
INSERT INTO tb_hl_empresa_funcionario (id_empresa_funcionario, id_empresa, id_funcionario) VALUES (4, 4, 4);
INSERT INTO tb_hl_empresa_funcionario (id_empresa_funcionario, id_empresa, id_funcionario) VALUES (5, 5, 5);
INSERT INTO tb_hl_empresa_funcionario (id_empresa_funcionario, id_empresa, id_funcionario) VALUES (6, 6, 6);
INSERT INTO tb_hl_empresa_funcionario (id_empresa_funcionario, id_empresa, id_funcionario) VALUES (7, 7, 7);

-- INSERTS TB Prestador
INSERT INTO tb_hl_prestador (id_prestador, id_empresa_funcionario, local_prestador) VALUES (1, 1, 'Local A');
INSERT INTO tb_hl_prestador (id_prestador, id_empresa_funcionario, local_prestador) VALUES (2, 2, 'Local B');
INSERT INTO tb_hl_prestador (id_prestador, id_empresa_funcionario, local_prestador) VALUES (3, 3, 'Local C');
INSERT INTO tb_hl_prestador (id_prestador, id_empresa_funcionario, local_prestador) VALUES (4, 4, 'Local D');
INSERT INTO tb_hl_prestador (id_prestador, id_empresa_funcionario, local_prestador) VALUES (5, 5, 'Local E');
INSERT INTO tb_hl_prestador (id_prestador, id_empresa_funcionario, local_prestador) VALUES (6, 6, 'Local F');
INSERT INTO tb_hl_prestador (id_prestador, id_empresa_funcionario, local_prestador) VALUES (7, 7, 'Local G');

-- INSERTS TB Prestador Modal
INSERT INTO tb_hl_prestador_modal (id_prestador_modal, id_prestador, id_modal, placa_guincho) VALUES (1, 1, 1, 'GUINC123');
INSERT INTO tb_hl_prestador_modal (id_prestador_modal, id_prestador, id_modal, placa_guincho) VALUES (2, 2, 2, 'GUINC456');
INSERT INTO tb_hl_prestador_modal (id_prestador_modal, id_prestador, id_modal, placa_guincho) VALUES (3, 3, 3, 'GUINC789');
INSERT INTO tb_hl_prestador_modal (id_prestador_modal, id_prestador, id_modal, placa_guincho) VALUES (4, 4, 1, 'GUINC321');
INSERT INTO tb_hl_prestador_modal (id_prestador_modal, id_prestador, id_modal, placa_guincho) VALUES (5, 5, 2, 'GUINC654');
INSERT INTO tb_hl_prestador_modal (id_prestador_modal, id_prestador, id_modal, placa_guincho) VALUES (6, 6, 3, 'GUINC987');
INSERT INTO tb_hl_prestador_modal (id_prestador_modal, id_prestador, id_modal, placa_guincho) VALUES (7, 7, 4, 'GUINC000');

-- INSERTS TB Marca
INSERT INTO tb_hl_marca(id_marca, marca_veiculo) VALUES(1, 'Scania');
INSERT INTO tb_hl_marca(id_marca, marca_veiculo) VALUES(2, 'Volvo');
INSERT INTO tb_hl_marca(id_marca, marca_veiculo) VALUES(3, 'Mercedez-Benz');
INSERT INTO tb_hl_marca(id_marca, marca_veiculo) VALUES(4, 'Volkswagen');
INSERT INTO tb_hl_marca(id_marca, marca_veiculo) VALUES(5, 'Ford');
INSERT INTO tb_hl_marca(id_marca, marca_veiculo) VALUES(6, 'Iveco');
INSERT INTO tb_hl_marca(id_marca, marca_veiculo) VALUES(7, 'DAF');

-- INSERTS TB Tipo Veiculo
INSERT INTO tb_hl_tipo_veiculo(id_tipo_veiculo, tipo_veiculo) VALUES(1, 'Caminhão');
INSERT INTO tb_hl_tipo_veiculo(id_tipo_veiculo, tipo_veiculo) VALUES(2, 'Carro');
INSERT INTO tb_hl_tipo_veiculo(id_tipo_veiculo, tipo_veiculo) VALUES(3, 'SUV');
INSERT INTO tb_hl_tipo_veiculo(id_tipo_veiculo, tipo_veiculo) VALUES(4, 'Moto');
INSERT INTO tb_hl_tipo_veiculo(id_tipo_veiculo, tipo_veiculo) VALUES(5, 'Ônibus');
INSERT INTO tb_hl_tipo_veiculo(id_tipo_veiculo, tipo_veiculo) VALUES(6, 'Van');
INSERT INTO tb_hl_tipo_veiculo(id_tipo_veiculo, tipo_veiculo) VALUES(7, 'Caminhonete');

-- INSERTS TB Modelo
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(1, 'P-360 B 4x2 2p (diesel)(E5)', 2023, 9055, 3035, 2, 7063);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(2, 'R-480 A 6x4 2p (diesel) (E5)', 2014, 7080, 3545, 3, 9917);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(3, 'R-480 A 6x4 2p (diesel) (E5)', 2017, 7080, 3545, 3, 9917);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(4, 'R-480 A 6x4 2p (diesel) (E5)', 2019, 7080, 3545, 3, 9917);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(5, 'R-480 A 4x2 HIG. 3-E./A 6x2 (dies.) (E5)', 2012, 7145, 3545, 3, 8756);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(6, 'R-480 A 4x2 HIG. 3-E./A 6x2 (dies.) (E5)', 2015, 7145, 3545, 3, 8756);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(7, 'R-480 A 4x2 HIG. 3-E./A 6x2 (dies.) (E5)', 2018, 7145, 3545, 3, 8756);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(8, 'R-480 A 8x2 HIGHLINE 2p (diesel)(E5)', 2016, 7480, 3618, 4, 10394);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(9, 'R-480 A 8x2 HIGHLINE 2p (diesel)(E5)', 2018, 7480, 3618, 4, 10394);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(10, 'G-400 A 4x2 2p (diesel) (E5)', 2013, 5780, 3270, 2, 7801);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(11, 'G-400 A 4x2 2p (diesel) (E5)', 2015, 5780, 3270, 2, 7801);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(12, 'G-400 A 4x2 2p (diesel) (E5)', 2018, 5780, 3270, 2, 7801);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(13, 'G-440 A 6x4 2p (diesel) (E5)', 2014, 7190, 3210, 3, 9590);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(14, 'G-440 A 6x4 2p (diesel) (E5)', 2015, 7190, 3210, 3, 9590);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(15, 'G-440 A 6x4 2p (diesel) (E5)', 2016, 7190, 3210, 3, 9590);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(16, 'G-480 B 8x4 2p (diesel) (E5)', 2012, 8190, 3210, 4, 12447);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(17, 'G-480 B 8x4 2p (diesel) (E5)', 2014, 8190, 3210, 4, 12447);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(18, 'G-480 B 8x4 2p (diesel) (E5)', 2016, 8190, 3210, 4, 12447);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(19, 'G-480 B 8x4 2p (diesel) (E5)', 2018, 8190, 3210, 4, 12447);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(20, 'P-250 B 4x2 2p (diesel) (E5)', 2012, 7855, 3077, 2, 6725);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(21, 'P-250 B 4x2 2p (diesel) (E5)', 2013, 7855, 3077, 2, 6725);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(22, 'P-250 B 4x2 2p (diesel) (E5)', 2015, 7855, 3077, 2, 6725);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(23, 'P-250 B 4x2 2p (diesel) (E5)', 2016, 7855, 3077, 2, 6725);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(24, 'P-250 B 4x2 2p (diesel) (E5)', 2022, 7855, 3077, 2, 6725);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(25, 'P-310 B 6x4 2p (diesel)', 2008, 7190, 2999, 3, 8575);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(26, 'P-310 B 6x4 2p (diesel)', 2011, 7190, 2999, 3, 8575);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(27, 'P-310 B 6x2 2p (diesel) (E5)', 2012, 10155, 3077, 3, 8114);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(28, 'P-310 B 6x2 2p (diesel) (E5)', 2014, 10155, 3077, 3, 8114);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(29, 'P-310 B 6x2 2p (diesel) (E5)', 2019, 10155, 3077, 3, 8114);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(30, 'P-310 B 8x2 2p (diesel)', 2011, 11355, 3077, 4, 9089);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(31, 'P-310 B 8x2 2p (diesel)', 2012, 11355, 3077, 4, 9089);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(32, 'P-250 B 8x4 2p (diesel) (E5)', 2012, 8190, 2999, 4, 9917);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(33, 'P-250 B 8x4 2p (diesel) (E5)', 2013, 8190, 2999, 4, 9917);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(34, 'P-250 B 8x4 2p (diesel) (E5)', 2016, 8190, 2999, 4, 9917);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(35, 'R-400 A 4x2 3-Eixos/A 6x2 2p (dies.)(E5)', 2012, 7145, 3338, 3, 8742);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(36, 'R-400 A 4x2 3-Eixos/A 6x2 2p (dies.)(E5)', 2014, 7145, 3338, 3, 8742);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(37, 'R-400 A 4x2 3-Eixos/A 6x2 2p (dies.)(E5)', 2016, 7145, 3338, 3, 8742);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(38, 'R-400 A 4x2 3-Eixos/A 6x2 2p (dies.)(E5)', 2018, 7145, 3338, 3, 8742);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(39, 'G-400 A 6x4 2p (diesel) (E5)', 2012, 6930, 3210, 3, 9771);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(40, 'G-400 A 6x4 2p (diesel) (E5)', 2013, 6930, 3210, 3, 9771);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(41, 'G-400 A 6x4 2p (diesel) (E5)', 2015, 6930, 3210, 3, 9771);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(42, 'G-400 A 6x4 2p (diesel) (E5)', 2016, 6930, 3210, 3, 9771);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(43, 'G-400 A 4x2 3-Eixos/A 6x2 2p(dies.) (E5)', 2012, 7030, 3270, 3, 9017);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(44, 'G-400 A 4x2 3-Eixos/A 6x2 2p(dies.) (E5)', 2015, 7030, 3270, 3, 9017);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(45, 'G-400 A 4x2 3-Eixos/A 6x2 2p(dies.) (E5)', 2017, 7030, 3270, 3, 9017);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(46, 'G-400 A 4x2 3-Eixos/A 6x2 2p(dies.) (E5)', 2018, 7030, 3270, 3, 9017);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(47, 'G-360 A 4x2 (diesel)(E5)', 2012, 5780, 3270, 2, 7612);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(48, 'G-360 A 4x2 (diesel)(E5)', 2022, 5780, 3270, 2, 7612);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(49, 'G-360 A 4x2 3-Eixos/A 6x2 2p (dies.)(E5)', 2015, 7055, 3270, 3, 9017);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(50, 'G-360 A 4x2 3-Eixos/A 6x2 2p (dies.)(E5)', 2021, 7055, 3270, 3, 9017); 
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(51, 'FH-420 4X2 2p (diesel) (E6)', 2023, 7860, 3650, 2, 8225);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(52, 'FH-420 4x2 2p (diesel) (E5)', 2021, 7860, 3650, 2, 8105);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(53, 'FH-420 6X2 2p (diesel) (E6)', 2023, 6895, 3650, 2, 9326);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(54, 'FH-420 6x2 2p (diesel) (E5)', 2021, 6895, 3650, 2, 9023);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(55, 'FH-460 GLOBETROTTER 4x2 2p (diesel) (E5)', 2020, 7860, 3955, 2, 8275);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(56, 'FH-460 GLOBETROTTER 6X2 2p (diesel) (E6)', 2023, 6895, 3955, 2, 9376);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(57, 'FH-460 GLOBETROTTER 8x2 2p (diesel) (E5)', 2016, 7440, 3955, 2, 9712);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(58, 'FH-460 GLOBETROTTER 8x2 2p (diesel) (E5)', 2019, 7440, 3955, 2, 9712);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(59, 'FH-460 GLOBETROTTER 8x2 2p (diesel) (E5)', 2023, 7440, 3955, 2, 9712);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(60, 'FH-500 6x4 2p (diesel) (E5)', 2012, 7260, 3650, 2, 9811);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(61, 'FH-500 6x4 2p (diesel) (E5)', 2015, 7260, 3650, 2, 9811);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(62, 'FH-500 6x4 2p (diesel) (E5)', 2018, 7260, 3650, 2, 9811);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(63, 'FH-500 8x2 2p (diesel) (E5)', 2016, 8260, 3650, 2, 9678);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(64, 'FH-500 8x2 2p (diesel) (E5)', 2018, 8260, 3650, 2, 9678);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(65, 'FH-500 8x2 2p (diesel) (E5)', 2021, 8260, 3650, 2, 9678);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(66, 'FH-500 GLOBETROTTER XL 6X4 (diesel) (E6)', 2023, 7260, 4100, 2, 10006);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(67, 'FH-540 4x2 2p (diesel) (E5)', 2013, 7860, 3650, 2, 8105);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(68, 'FH-540 4x2 2p (diesel) (E5)', 2016, 7860, 3650, 2, 8105);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(69, 'FH-540 4x2 2p (diesel) (E5)', 2018, 7860, 3650, 2, 8105);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(70, 'FH-540 4x2 2p (diesel) (E6)', 2023, 7860, 3650, 2, 8225);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(71, 'FH-540 8x2 2p (diesel) (E6)', 2023, 8260, 3650, 2, 9798);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(72, 'FH-540 8X4 2p (diesel) (E5)', 2015, 8260, 3650, 2, 9798);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(73, 'FH-540 8X4 2p (diesel) (E5)', 2017, 8260, 3650, 2, 9798);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(74, 'FH-540 GLOBETROTTER 6x4 2p (diesel) (E5)', 2012, 7260, 4100, 2, 9886);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(75, 'FH-540 GLOBETROTTER 6x4 2p (diesel) (E5)', 2014, 7260, 4100, 2, 9886);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(76, 'FH-540 GLOBETROTTER 6x4 2p (diesel) (E5)', 2015, 7260, 4100, 2, 9886);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(77, 'FH-540 GLOBETROTTER 6x4 2p (diesel) (E5)', 2019, 7260, 4100, 2, 9886);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(78, 'FM 380 4x2 2p (diesel)(E5)', 2016, 8010, 3585, 2, 7540);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(79, 'FM 380 4x2 2p (diesel)(E5)', 2017, 8010, 3585, 2, 7540);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(80, 'FM 380 4x2 2p (diesel)(E5)', 2019, 8010, 3585, 2, 7540);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(81, 'FM 380 6x2 2p (diesel)(E5)', 2015, 6540, 3585, 2, 8444);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(82, 'FM 380 6x2 2p (diesel)(E5)', 2017, 6540, 3585, 2, 8444);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(83, 'FM 380 6x2 2p (diesel)(E5)', 2021, 6540, 3585, 2, 8444);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(84, 'FM 380 6X2 2p (diesel)(E6)', 2023, 6540, 3585, 2, 8565);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(85, 'FMX 380 6X4 2p (diesel) (E6)', 2023, 7115, 3124, 2, 10025);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(86, 'FMX 380 8x4 2p (diesel) (E5)', 2019, 8065, 3222, 2, 11688);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(87, 'FMX 380 8x4 2p (diesel) (E5)', 2022, 8065, 3222, 2, 11688);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(88, 'FMX 460 8X4 2p (diesel) (E6)', 2023, 8065, 3222, 2, 11808);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(89, 'VM 270 4x2 2p (diesel) (E5)', 2012, 6245, 2784, 2, 5350);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(90, 'VM 270 4x2 2p (diesel) (E5)', 2015, 6245, 2784, 2, 5350);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(91, 'VM 270 CITY 4x2 2p (diesel) (E5)', 2021, 6765, 2784, 2, 5350);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(92, 'VM 290 8X2 2p (diesel) (E6)', 2023, 10215, 2784, 2, 8188);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(93, 'VM 330 6x2 2p (diesel) (E5)', 2012, 7465, 2784, 2, 6580);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(94, 'VM 330 6x2 2p (diesel) (E5)', 2015, 7465, 2784, 2, 6580);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(95, 'VM 330 6x2 2p (diesel) (E5)', 2017, 7465, 2784, 2, 6580);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(96, 'VM 330 6x2 2p (diesel) (E5)', 2021, 7465, 2784, 2, 6580);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(97, 'VM 330 6x4 2p (diesel) (E5)', 2013, 7535, 2872, 2, 7455);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(98, 'VM 330 6x4 2p (diesel) (E5)', 2017, 7535, 2872, 2, 7455);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(99, 'VM 360 8X2 2p (diesel) (E6)', 2023, 10215, 2784, 2, 8101);
INSERT INTO tb_hl_modelo(id_modelo, modelo_veiculo, ano_modelo, comprimento_veiculo, altura_veiculo, eixo_veiculo, peso_veiculo) VALUES(100, 'VM 360 8X4 2p (diesel) (E6)', 2023, 8235, 2860, 2, 7990);

-- INSERTS TB Veiculo
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(1, 1, 1, 1, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(2, 1, 1, 7, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(3, 1, 1, 12, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(4, 1, 1, 19, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(5, 1, 1, 21, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(6, 1, 1, 14, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(7, 1, 1, 31, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(8, 1, 1, 19, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(9, 1, 1, 44, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(10, 1, 1, 50, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(11, 1, 1, 10, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(12, 1, 1, 18, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(13, 1, 1, 33, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(14, 1, 1, 35, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(15, 1, 1, 49, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(16, 1, 1, 27, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(17, 1, 1, 25, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(18, 1, 1, 38, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(19, 1, 1, 11, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(20, 1, 1, 6, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(21, 1, 1, 20, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(22, 1, 1, 41, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(23, 1, 1, 5, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(24, 1, 1, 35, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(25, 1, 1, 23, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(26, 2, 1, 51, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(27, 2, 1, 57, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(28, 2, 1, 61, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(29, 2, 1, 66, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(30, 2, 1, 60, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(31, 2, 1, 77, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(32, 2, 1, 75, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(33, 2, 1, 72, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(34, 2, 1, 78, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(35, 2, 1, 80, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(36, 2, 1, 81, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(37, 2, 1, 64, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(38, 2, 1, 53, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(39, 2, 1, 72, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(40, 2, 1, 82, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(41, 2, 1, 95, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(42, 2, 1, 88, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(43, 2, 1, 87, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(44, 2, 1, 88, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(45, 2, 1, 90, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(46, 2, 1, 92, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(47, 2, 1, 94, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(48, 2, 1, 97, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(49, 2, 1, 98, 'N');
INSERT INTO tb_hl_veiculo(id_veiculo, id_marca, id_tipo_veiculo, id_modelo, chassi_alongado) VALUES(50, 2, 1, 100, 'N');

-- INSERTS TB Apolice
INSERT INTO tb_hl_apolice (id_apolice, id_veiculo, status_apolice, valor_apolice, vigencia_apolice, placa_veiculo) VALUES (1, 1, 'A', 1500.00, '2023-12-31', 'ABC1234');
INSERT INTO tb_hl_apolice (id_apolice, id_veiculo, status_apolice, valor_apolice, vigencia_apolice, placa_veiculo) VALUES (2, 2, 'A', 1600.00, '2023-12-31', 'XYZ5678');
INSERT INTO tb_hl_apolice (id_apolice, id_veiculo, status_apolice, valor_apolice, vigencia_apolice, placa_veiculo) VALUES (3, 3, 'A', 1700.00, '2023-12-31', 'LMN4321');
INSERT INTO tb_hl_apolice (id_apolice, id_veiculo, status_apolice, valor_apolice, vigencia_apolice, placa_veiculo) VALUES (4, 1, 'A', 1550.00, '2023-12-31', 'DEF5678');
INSERT INTO tb_hl_apolice (id_apolice, id_veiculo, status_apolice, valor_apolice, vigencia_apolice, placa_veiculo) VALUES (5, 4, 'A', 1400.00, '2023-12-31', 'GHI9012');
INSERT INTO tb_hl_apolice (id_apolice, id_veiculo, status_apolice, valor_apolice, vigencia_apolice, placa_veiculo) VALUES (6, 5, 'A', 1300.00, '2023-12-31', 'JKL3456');
INSERT INTO tb_hl_apolice (id_apolice, id_veiculo, status_apolice, valor_apolice, vigencia_apolice, placa_veiculo) VALUES (7, 2, 'A', 1650.00, '2023-12-31', 'OPQ7890');
INSERT INTO tb_hl_apolice (id_apolice, id_veiculo, status_apolice, valor_apolice, vigencia_apolice, placa_veiculo) VALUES (8, 1, 'A', 1850.00, '2023-12-31', 'AMQ0951');

-- INSERTS TB Cliente Apolice
INSERT INTO tb_hl_cliente_apolice (id_cliente, id_apolice) VALUES (1, 1);
INSERT INTO tb_hl_cliente_apolice (id_cliente, id_apolice) VALUES (2, 2);
INSERT INTO tb_hl_cliente_apolice (id_cliente, id_apolice) VALUES (3, 3);
INSERT INTO tb_hl_cliente_apolice (id_cliente, id_apolice) VALUES (4, 4);
INSERT INTO tb_hl_cliente_apolice (id_cliente, id_apolice) VALUES (5, 5);
INSERT INTO tb_hl_cliente_apolice (id_cliente, id_apolice) VALUES (6, 6);
INSERT INTO tb_hl_cliente_apolice (id_cliente, id_apolice) VALUES (7, 7);

-- INSERTS TB Serviço
INSERT INTO tb_hl_servico (id_servico, id_cliente, id_prestador_modal, hora_servico, local_usuario, status_ordem) VALUES (1, 1, 1, PARSEDATETIME('2023-11-02, 08:00:00', 'YYYY-MM-DD, HH:mm:ss'), 'Local A', 'A');
INSERT INTO tb_hl_servico (id_servico, id_cliente, id_prestador_modal, hora_servico, local_usuario, status_ordem) VALUES (2, 2, 2, PARSEDATETIME('2023-11-03, 09:30:00', 'YYYY-MM-DD, HH:mm:ss'), 'Local B', 'P');
INSERT INTO tb_hl_servico (id_servico, id_cliente, id_prestador_modal, hora_servico, local_usuario, status_ordem) VALUES (3, 3, 3, PARSEDATETIME('2023-11-04, 10:15:00', 'YYYY-MM-DD, HH:mm:ss'), 'Local C', 'A');
INSERT INTO tb_hl_servico (id_servico, id_cliente, id_prestador_modal, hora_servico, local_usuario, status_ordem) VALUES (4, 4, 4, PARSEDATETIME('2023-11-05, 14:45:00', 'YYYY-MM-DD, HH:mm:ss'), 'Local D', 'P');
INSERT INTO tb_hl_servico (id_servico, id_cliente, id_prestador_modal, hora_servico, local_usuario, status_ordem) VALUES (5, 5, 5, PARSEDATETIME('2023-11-06, 15:30:00', 'YYYY-MM-DD, HH:mm:ss'), 'Local E', 'A');
INSERT INTO tb_hl_servico (id_servico, id_cliente, id_prestador_modal, hora_servico, local_usuario, status_ordem) VALUES (6, 6, 6, PARSEDATETIME('2023-11-07, 16:20:00', 'YYYY-MM-DD, HH:mm:ss'), 'Local F', 'P');
INSERT INTO tb_hl_servico (id_servico, id_cliente, id_prestador_modal, hora_servico, local_usuario, status_ordem) VALUES (7, 7, 7, PARSEDATETIME('2023-11-08, 17:10:00', 'YYYY-MM-DD, HH:mm:ss'), 'Local G', 'A');
