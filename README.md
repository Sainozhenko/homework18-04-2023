Задача1

Есть класс Address с полями
String street
int houseNumber

и класс Person с полями
String name
int age
Address address

Используя стримы, написать метод, принимающий список персонов и возвращающий список адресов тех, кто старше 17 лет.
List<Address>getAddresses(List<Person> input)

Задача2

Используя стримы написать метод, принимающий строку, состоящую из слов, разделенных пробелом и букву и возвращающий количество слов, начинающихся с этой буквы.
long countWords (String input, String letter)

пример: принимает "aaa ffff aa bbbb a bb aaa gggggggggggggg" и "a" -> возвращает 4 , т.к. слово, начинающееся на a встречается 4 раза.
