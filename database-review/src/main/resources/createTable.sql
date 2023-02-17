create table Towns(
                      id serial unique not null,
                      code varchar(10) not null, -- not unique
                      article text,
                      name text not null -- not unique
);

insert into towns( code, article, name)
select
    left(md5(i::text), 10),
    md5(random()::text),
    md5(random()::text)
from generate_series(1, 1000000) s(i);

select * from towns;

select count(*) from towns;

explain analyse
select * from towns where name = '780ed429fccdcf213566ab7397c10e46';

explain analyse select * from towns where id = 1232;

create index idx_towns_name on towns(name);
create index idx_towns_article on towns(article);

drop index if exists idx_towns_name;

