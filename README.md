Марко Лазаревски 213191

Conrol Flow Graph
![si drawio](https://github.com/Markofx/SI_2023_lab2_213191/assets/129691838/fef2a43f-3a82-4cee-ab17-b37ad9cd43a5)


Цикломатичната комплесност изнесува 11 (добиено со броење на бројот на затворени региони).
Како прв чекор треба да се напишат сите можни гранки, па потоа треба да се напишат најмал број на тестови кои ќе ги опфатат сите гранки. се опафќаат сите гранки во 5 тестови.

-Во првиот услов ќе се тестира Exception така што ќе испратиме user со null вредност (user=null и allUsers=anything).

- Во вториот услов, ќе ги провериме условите за е-пошта и лозинка (mail,password). За условот за е-пошта, ќе создадеме два корисници: еден со иста е-пошта и корисничко име како корисникот што го споредуваме; другиот без. За да го овозможиме ова, ќе ни требаат следните вредности: allUsers=[Marko,Andrej], user.username=Marconi123@gmail.com, user.email="Marconi123@gmail.com", user.password="marconi" , корисник Marko=нов корисник ("Marconi123@gmail.com","Marconi123@gmail.com", marconi), корисник Андреј=нов корисник ("Hvejo@gmail.com","Hvejo@gmail.com","Hvert"), итн.

-Во третиот услов ќе ги истестираме условите за mail и password, за да ги поминеме сите гранки што сè уште не сме ги положиле и да поминеме и дополнителни гранки во сегментот за лозинка, конкретно ќе тестираме дали лозинката содржи специјални знаци и дали има празни места, каде што ќе направиме да содржи специјални знаци, но не празни места, во третиот тест. User.username="Marko", User.Email="Marko", User.Password="lazarevski!@#" и AllUsers=null се вредностите што ќе ни требаат за да го овозможиме.

- Во четвртиот услов, ќе го тестираме делот од лозинката што не содржи ниту празни места, ниту специјални знаци. User.username="Marko", User.Email="Marko", User.Password="lazarevski", AllUsers=null се вредностите што ќе ни требаат за да го овозможиме ова;

- Во петтиот услов, ќе провериме дали има празни места во лозинката. User.username="Marko", User.Email="Marko", User.Password="laz arevski" и AllUsers=null се вредностите што ќе ни требаат за да го овозможиме. Со помош на сите овие тестови, успеавме да ја поминеме секоја гранка.

