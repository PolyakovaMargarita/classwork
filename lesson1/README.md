> Bean: object with dependencies managed by Spring IoC container
> IoC Container: helps inject dependencies to object and make it ready to use

1) Print different messages based on configuration (using setters)

2) Add info about current time to one of the implementations (using constructor, mind the testability)
3) Property based message
4) Factory and system locale (Locale.getDefault())


MessagesAnouncer.anounce() <- Bean
EnglishMessage <- Bean
UkraininanMessage <- Bean

MessagesAnouncer.anounce() <- Call in Application class

