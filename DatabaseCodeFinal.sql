drop database if exists jdbctest;
create database jdbcTest;
use jdbctest;
/*The player table has required statements at the bottom of this file in order for the game to fully function*/
create table Player (name varchar(50), age integer) ENGINe=InnoDB;
create table Question(quest varchar(250), country varchar(50),answer varchar(250),wrongAns varchar(50),wrongAns2 varchar(50),wrongAns3 varchar(50)  ) ENGINe=InnoDB;

/*The unlockable content is contained in this table*/
create table Continent(name varchar(50), locked varchar(5)) ENGINe=InnoDB;
insert into continent values('Europe','No');
insert into continent values('America','Yes');
insert into continent values('Africa', 'Yes');
insert into continent values('Asia','Yes');
insert into continent values('Australia','Yes');



/*After inserting questions you must run the update beneath them for quizzes to function*/
/*Australia*/
insert into question values('What is the capital city of Australia?','australia', 'Canberra','Dublin','London','Melbourne');
insert into question values('What does Australia mean?','australia','South land', 'North land', 'East land', 'West land');
insert into question values('Which animal carries babies in its pouch?','australia','Kangaroo','Dingo','Badger','Fox');
insert into question values('What is the desert area of Australia called?','australia','Outback','Sahara','Forest','Himalayas'); 
insert into question values('Which nation first settled in Australia in 1788?','australia','Great Britain','Spain','Italy','Prussia');
insert into question values('What is the population of Australia?','australia','23 million','100','5 million','100,000');
insert into question values('What are the natives of Australia called?','australia','Aborigines','Farmers','Pirates','Roamers');
insert into question values('What is the name of the eastern coral reef?','australia','Great Barrier Reef','Skelligs','Florida Reef','Reed Bank');
insert into question values('What is the main language used?','australia','English','Chinese','Russian','French');
insert into question values('Name the biggest Australian mountain.','australia','Mount Kosciusko','Mount Everest','Carrauntoohil','Bimberi Peak');

/*New Zealand*/
insert into question values('What is the capital of New Zealand?','Newz','Wellington','Auckland','Sydney','Paris');
insert into question values('The famous rugby team from New Zealand is..','Newz','All Blacks','Lakers','Munster','Chelsea');
insert into question values('Which bird can only be found here?','Newz','Kiwi bird','Blue tit','Seagull','Woodpecker');
insert into question values('Which famous movies were filmed in N.Z?','Newz','Lord of the Rings','Star Wars','Tarzan','Dark Crystal');
insert into question values('Which country discovered New Zealand?','Newz','The Netherlands','Ireland','Britain','Portugal');
insert into question values('What is the giant weta?','Newz','Insect','Mountain','City','Bird');
insert into question values('How many people live here?','Newz','4 million','40 million','200 million','1 billion');
insert into question values('How many islands make up New Zealand?','Newz','2','4','20','none');
insert into question values('New Zealand is a part of what other country?','Newz','Britain','Kenya','Russia','Korea');

/*Algeria*/
insert into question values('What is the capital of Algeria?', 'Algeria','Algiers','Nigeria','Oran','Constantine');
insert into question values('What is the currency of Algeria?', 'Algeria','Dinar','Euro','Stearling','Doller');
insert into question values('What colours make up the flag of Algeria?', 'Algeria','Green, red and white','Red and Green','Blue and Green','Green and Pink');
insert into question values('What is the official language of Algeria?', 'Algeria','Arabic','French','Irish','English');
insert into question values('Where does Algeria rate in terms of size of African countries?', 'Algeria','Largest','Smalest','Miduim High','Meduim Low');		
			
/*Nigeria Questions  */
insert into question values('Nigeria was first colonized by?', 'Nigeria','Great Britain','Germany','Portugal','France');
insert into question values('Nigeria is intersected by two major rivers?', 'Nigeria','Benue and Niger','Benue and Tangayika','Nile and Niger','Niger and Limpopo');
insert into question values('Who was the first governor of a unified Nigeria?', 'Nigeria', 'Frederick Lugard','Sir Hugh Clifford', 'Lord Selborne','Sir Arthur Richards');
insert into question values('Nigeria gained independence in?', 'Nigeria','1960','1950','1962','1955');
insert into question values( 'Nigerias surface area is?', 'Nigeria','923,850 sq km ','623,850 sq km','723,850 sq km','823,850 sq km');
insert into question values( 'When is nigeria,s national holiday?', 'Nigeria','October 1','October 21st','September 11th',' April 27th');
insert into question values( 'What is the currency ?', 'Nigeria','Naira','Euro','Sterling','Dollers');
insert into question values( 'What is the litracey rate in nigeria?', 'Nigeria',' 61.3%','68%','70%','50%');
insert into question values( 'How many states are in Nigeria?', 'Nigeria','36','21','30','19');
insert into question values( 'What is africa,s most populous country ?', 'Nigeria','Nigeria','Congo','Mali','Algeria');

/* Egypt Questions  */
insert into question values( 'During which months is the flooding season?', 'Egypt','June to September','July','August','May');
insert into question values('What was the Egyptian,s favourite animal?', 'Egypt','Cat','Dog','Bear','Sheep');
insert into question values( 'Tall grass used to make baskets, sandals, boats, and writing paper was called?', 'Egypt','Papyrus','Reeds ','Stalks','None of the above');
insert into question values( 'What was a Pharaoh?', 'Egypt','The leader of Egypt','A statue to the Egyptian gods','Structure where Egyptian kings were buried','All of the above');
insert into question values( 'What is the longest river in egypt?', 'Egypt','The Nile','The Pilaponesian','The Sebennytic','The Bolbitinic');
insert into question values( 'What shape a?', 'Egypt','June to September','July','August','May');
insert into question values( 'Which one of these Egyptian monuments is known as one of the 7 wonders of the World ?', 'Egypt','Kheops pyramid','Cairo museum','Abu Simbels temple','Karnak temple');
insert into question values( 'How high was the Big Pyramid (Kheops kings tomb) ?', 'Egypt','147 Meters','5 Meters','228 Meters','360 Meters');
insert into question values( 'Which one of these animals was not a sacred egyption animal ?', 'Egypt','The duck','The cat','The ibis','The baboon');
insert into question values( 'Where is the source of the river nile?', 'Egypt','Lake Victoriav','Mediterranean Sea','Isthmus of Suez','All of the above');

/* Sudan Questions*/ 
insert into question values( 'Which river flows through Sudan?', 'Sudan','The Nile','The Amazon','The Rhine','The Moy');
insert into question values( 'How many people live in Sudan?', 'Sudan','35 Million','8.3 Million','13 Million','24 Million');
insert into question values( 'Who lives in northern Sudan?', 'Sudan','Muslim Arabs','Christian Arabs','Christioan Arabs','Hindu Indians');
insert into question values( 'What is the capital of Sudan?', 'Sudan','Khartoum','Algiers','Djibouti','Juba');
insert into question values( 'What currencey do they use in sudan?', 'Sudan','Dinar','Euro','Sterling','Doller');

/* Democratic Rep Congo  Questions*/ 
insert into question values( 'How many countries is the Democratic Rep Congo bordered by?', 'Congo','9','12','3','6');
insert into question values( 'What is the population of the Democratic Rep Congo?', 'Congo','60 Million','100 Million','40 Million',' 20 Million');
insert into question values( 'What is the capital of the Democratic Rep Congo?', 'Congo','Kinshasa','Algiers','Khartoum','Malakal');
insert into question values( 'What is the Currency of the the Democratic Rep Congo?', 'Congo','Congolese franc','Doller','Khartoum','Euro');
insert into question values( 'What are the main imports from the region?', 'Congo','Oil and Diamonds','Food oil and poultry','Ivory and Silver','Silver and Bronze');

insert into question values('What is the capital of Mongolia?', 'Mongolia','Ulaan Baatar','Beijing','Moscow','Dublin');
insert into question values('What is the life expectancy of Mongolia?', 'Mongolia','65','78','99','21');
insert into question values('What is the currency of Mongolia?', 'Mongolia','Tugrik','Yen','Mongolian Dollar','Pound');
insert into question values('What is the official language of Mongolia?', 'Mongolia','Mongolian','Russian','Hindi','English');
insert into question values('What is the main religion of Mongolia?', 'Mongolia','Buddhism','Hindi','Christianity','None of the above');

/*Japan Questions  */
insert into question values('What is the capital of Japan?', 'Japan','Tokyo','Beijing','Hiroshima','Shanghai');
insert into question values('What is the currency of Japan?', 'Japan','Yen','Dollar','Pound','Shilling');
insert into question values('What is the offical language of Japan?', 'Japan','Japanese','Chinese','Hindi','Klingon');
insert into question values('Where is the highest point of Japan?', 'Japan','Mount Fuji','Mt Everest','Tokyo Tower','Mount Nagasaki');
insert into question values( 'What is the national sport of Japan?', 'Japan','Sumo Wrestling','Baseball','Taekwondo','Karate');
insert into question values( 'How many islands is Japan made up of?', 'Japan','6852','15','263','1372');
insert into question values( 'What is the literacy rate in Japan?', 'Japan','99%','78%','50%','87%');
insert into question values( 'What is the unemployment rate of Japan?', 'Japan','4%','99%','50%','34%');
insert into question values( 'On average, how many earthquakes occur in Japan?', 'Japan','1500','24','78','5800');
insert into question values( 'What is the national anthem of Japan called?', 'Japan','Kimigayo','Katsumoto','Akane','Hotaka');
insert into question values( 'Which of these was an ancient warrior in Japan?', 'Japan','Samurai','Barbarian','Knight','Priest');

/*India Questions  */
insert into question values( 'What is the capital of India?', 'India','New Dehli','Bombay','Mumbai','Punjab');
insert into question values( 'What is the currency of India?', 'India','Rupee','Dollar','Yen','None of the above');
insert into question values( 'What is the official language of India?', 'India','Hindi','English','Bengali','Punjabi');
insert into question values( 'What is the main religion of India?', 'India','Hindu','Buddhism','Judaism','Islam');
insert into question values( 'What is the life expectancy of India?', 'India','63','72','56','78');
insert into question values( 'The percentage of earth surface covered by India is....', 'India','2.4','9.8','5.6','1.2');
insert into question values( 'Tripitakas are sacred books of which religion?', 'India','Buddhism','Christianity','Hindi','Nine of the above');
insert into question values( 'What is the name of the country that colonized India?', 'India','Britain','Holland','Portugal','Spain');
insert into question values( 'What year did the East India Company get dissolved?', 'India','1858','1990','1764','1867');
insert into question values( 'On average, what is the amount of people whogather for the Kumbh Mela Festival?', 'India','100 Million','200 Million','300 Million','4 Million');

/*Saudi Arabia Questions  */
insert into question values( 'What is the capital of Saudi Arabia?', 'Saudi Arabia','Riyadh','Mecca','Ta`if','Khobar');
insert into question values( 'What is the currency of Algeria?', 'Saudi Arabia','Saudi Arabian Riyal','Saudi Arabian Dollar','Yen','None of the above');
insert into question values( 'Saudi Arabia is the birthplace of which religion?', 'Saudi Arabia','Islam','Christianity','Buddhism','Paganism');
insert into question values( 'How many rivers are in Saudi Arabia?', 'Saudi Arabia','0','9','112','53');
insert into question values( 'Where year was universal sufferage made legal in Saudi Arabia?', 'Saudi Arabia','2015','1993','1956','2002');

/*China Questions  */
insert into question values( 'What is the capital of China?', 'China','Beijing');
insert into question values( 'What is the currency of China?', 'China','Renminbi');
insert into question values( 'What year did china host the Olympic Games?', 'China','2008');
insert into question values( 'What is the official language of China?', 'China','Mandarin');
insert into question values( 'What is the official religion of China?', 'China','None of the above');
insert into question values( 'What is the most popular sport of China?', 'China','Table Tennis');
insert into question values( 'What is the most common surname in China?', 'China','Li');
insert into question values( 'Which city were fortune cookies first invented?', 'China','San Francisco');
insert into question values( 'How many chopsticks are used every year in China?', 'China','45 Billion');
insert into question values( 'How many people still live in caves in China?', 'China','35 Million');

/* Ireland */
insert into question values('What is the captial of Ireland?', 'Ireland', 'Dublin', 'Limerick', 'Cork', 'Perth');
insert into question values('How many counties are there in Ireland?', 'Ireland', '32', '12', '108', '54');
insert into question values('Which of these is a famous landmark in Dublin?', 'Ireland', 'The Spire', 'The Giants Causeway', 'Pyramids', 'Eiffel Tower');
insert into question values('In which year did the Great Famine end?', 'Ireland', '1852', '100', '2006', '1945');
insert into question values('What is the biggest lake in Ireland?', 'Ireland', 'Lough Neagh','Salt Lake','Caspian Sea','Lough Corrib');
insert into question values('Who is Irelands current president?', 'Ireland', 'Michael D. Higgins','Barrack Obama','Vladimir Putin','Enda Kenny');
insert into question values( 'The Hurling team of which county are nicknamed The Cats?', 'Ireland', 'Killkenny','Donegal','Armagh','Tipperary');
insert into question values('What island did Father Ted live on?', 'Ireland', 'Craggy Island','The Isle of Wight','Inis Meain','Jamaica');
insert into question values('Which county is the Taoiseach Enda Kenny from?', 'Ireland', 'Mayo','Las Vegas','Dublin','Antrim');
insert into question values('What is the tallest mountain in Ireland?', 'Ireland', 'Carrauntoohil','Mount Everest','Croke Patrick','Mount Etna');
insert into question values('Which female boxer won a gold medal in the 2012 Olympics?', 'Ireland', 'Katie Taylor', 'Bernadette Dunne','Angela Tyson','Georgia Foreman');

/* Iceland */
insert into question values('What is the captial of Iceland?', 'Iceland', 'Reykjavik', 'Oslo', 'Kerry', 'Barcelona');
insert into question values('What is the name of the famous hot spring located in Grindavik?', 'Iceland', 'The Blue Lagoon', 'The Purple Lagoon', 'The Black Lagoon', 'The Hot Lagoon');
insert into question values('What is the name of the sky lights that can often be seen in Iceland which are also called the Northern Lights?', 'Iceland', 'Aurora Borealis', 'The Shiny Lights', 'Aurora Australis', 'Aurora Bearyalice');
insert into question values('Who were the first to arrive in Iceland?', 'Iceland', 'The Vikings', 'The Mongols', 'The Celts', 'The Romans');
insert into question values('How many letters are in the Icelandic alphabet?', 'Iceland', '36', '14', '26', '54');

/* Spain */
insert into question values('What is the capital of Spain?', 'Spain', 'Madrid', 'Barcelona', 'Seville', 'Bangkok');
insert into question values('Which famous spanish sport does a matador take part in? ', 'Spain', 'Bull Fighting', 'Swimming', 'Hockey', 'Water Polo');
insert into question values('The Nou Camp is a Stadium which is home to which football team?', 'Spain', 'Barcelona FC', 'Real Madrid', 'man city', 'rovers');
insert into question values('Which country borders Spain to the west?', 'Spain', 'Portugal', 'Germany', 'Bulgaria', 'Ireland');
insert into question values('What year did the Spanish civil war take place?', 'Spain', '1936', '2006', '1006', '2036');

insert into question values('What is the capital city of Canada?', 'Canada','Ottawa','Montreal','Toronto','Vancouver');
insert into question values('What is the largest city in Canada?', 'Canada','Toronto','Montreal','Ottawa','Vancouver');
insert into question values('What is the national sport of Canada?', 'Canada','Ice-hockey','Football','Basketball','Rugby');
insert into question values('What is the national symbol of Canada?', 'Canada','Maple leaf','Dear Antlers','Canadian Mole rat','Hockey stick');
insert into question values('What is Canada`s largest export?', 'Canada','Maple Syrup','Hockey pucks','Moose coats','A winning smile');

/*USA Questions  */
insert into question values('How many states in the United States of America?', 'USA','50','49','48','51');
insert into question values('Which city in the USA has the highest population?', 'USA','New York','Chicago','Washington D.C.','Los Angeles');
insert into question values('What is the capital city of the USA?', 'USA','Washington DC','Boston','New York','Los Angeles');
insert into question values('Who was the first American president?', 'USA','George Washington','Thomas Jefferson','Abraham Lincoln','Barrack Obama');
insert into question values( 'What currency is used in the USA?', 'USA','Dollars','Euros','Pound','Yen');
insert into question values( 'What is the longest river in the USA?', 'USA','Missouri river ','Mississippi River','Michigan River','Yukon River');
insert into question values( 'How many stars are there on the American flag?', 'USA','50','55','45','60');
insert into question values( 'How many stripes are there on the American flag?', 'USA','13','12','15','14');
insert into question values( 'What date is Independence day?', 'USA','4th of July','5th of April','1st of September','12th of July');
insert into question values( 'Who is the current president of the USA?', 'USA','Barrack Obama','Mitt Roney','Michael D. Higgins','George W. Bush');

/*Brazil Questions  */
insert into question values( 'What is the capital city of Brazil?','Brazil','Brasilia','Rio de janeiro','Sao Paulo','Salvador');
insert into question values( 'What is the official language of Brazil?', 'Brazil','Portuguese','Spanish','English','Brazilian');
insert into question values( 'What is the largest city in Brazil?', 'Brazil','Sao Paulo','Rio de janeiro','Salvador','Brasilia');
insert into question values( 'The second largest river in the world is in Brazil, what is it called?', 'Brazil','Amazon River','The Nile','Yangtze River','Yellow River');
insert into question values( 'What is the most popular sport in Brazil?', 'Brazil','Football','Volleyball','Basketball','Hockey');
insert into question values( 'How many times has Brazil won the FIFA World Cup?', 'Brazil','5','4','3','2');
insert into question values( 'Brazil is the __ largest country in the world?', 'Brazil','5th','6th','2nd','3rd');
insert into question values( 'When did Brazil gain its independence from Portugal?', 'Brazil','September 7th, 1822 ','january 12th, 1825','September 8th 1820','january 10th 1822');
insert into question values( 'What country discovered Brazil?', 'Brazil','Portugal','Spain','Holland','Britain');
insert into question values( 'What is the most popular religion in Brazil?', 'Brazil','Roman Catholic','Jewish','Protestant','Buddhism');

/*Peru Questions  */
insert into question values( 'What is the capital cit of Peru?', 'Peru','Lima','Arequipa','Trujillo','Chiclayo');
insert into question values( 'What is the main language spoken in Peru?', 'Peru','Spanish','Portuguese','Peruvian','French');
insert into question values( 'What currency do they use in Peru?', 'Peru','Nuevo Sol','Peruvian Dollar','Euro','Yen');
insert into question values( 'What is the famous Incan capital city that resides in Peru?', 'Peru','Machu Picchu','Pika Ducko','Ralino Portana','Incano Trevelo');
insert into question values( 'What major mountain range can be found in Peru?', 'Peru','Andes','K2','Himalayas','Mount Everest');

/*required statement, run after inserting all questions*/
alter table Question add(q_sel char(1));
update Question set q_sel = 'N';

/*required update*/
alter table Player add(p_sel char(1));
update Player set p_sel = 'N';
alter table Player add(score integer);
update Player set score = 0;









