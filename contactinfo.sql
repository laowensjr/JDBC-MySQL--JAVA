— Table structure for table ‘contactinfo’
—
CREATE TABLE IF NOT EXISTS contactinfo (
id int(11) NOT NULL AUTO_INCREMENT,
firstname varchar(50) NOT NULL,
lastname varchar(50) NOT NULL,
street varchar(100) NOT NULL,
street2 varchar(50) NOT NULL,
city varchar(50) NOT NULL,
state varchar(25) NOT NULL,
zip int(25) NOT NULL,
PRIMARY KEY (id)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;