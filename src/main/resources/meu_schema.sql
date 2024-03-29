create table cliente(
  id integer not null primary key auto_increment,
  nome varchar(100),
  CPF varchar(11)

  );

  create table produto(
  id int not null primary key auto_increment,
  descricao varchar(100),
  preco_unitario numeric(20,2)
  );

  create table pedido(
  id int not null primary key auto_increment,
  cliente_id integer references cliente  (id),
  data_pedido timestamp,
  STATUS varchar(20),
  total numeric(20,2)
  );
  create table item_pedido(
  id int not null primary key auto_increment,
  pedido_id integer references pedido  (id),
  produto_id integer references produto  (id),
  quantidade integer


  );
  create table  USUARIO(
  ID integer PRIMARY KEY AUTO_INCREMENT,
  LOGIN varchar(50) not null,
  SENHA varchar(255) not null,
  ADMIN bool DEFAULT FALSE
  );