create database EstudApp;
use EstudApp;

create table Periodos(
 id bigint auto_increment primary key,
 nome varchar(255),
 inicioPeriodo date,
 finalPeriodo date
);

create table Disciplinas(
 id bigint auto_increment primary key,
 nome varchar(255),
 mediaAprovar decimal(4, 2),
 idPeriodo bigint,
 constraint fk_idPeriodo foreign key (idPeriodo) references Periodos(id)
 on delete cascade
);

create table Avaliacoes(
 id bigint auto_increment primary key,
 nome varchar(255),
 dataAvaliacao date,
 notaAvaliacao decimal(4, 2) default null,
 idDisciplina bigint,
 constraint fk_idDisciplina foreign key (idDisciplina) references Disciplinas(id)
 on delete cascade
);

create table Baralhos(
	id bigint auto_increment primary key,
    titulo varchar(255),
    descricao varchar(255)
);

create table FlashCards(
	id bigint auto_increment primary key,
    pergunta varchar(255),
    resposta varchar(400),
    idBaralho bigint,
    constraint fk_idBaralho foreign key (idBaralho) references Baralhos(id)
    on delete cascade
);