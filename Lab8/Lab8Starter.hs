--Christina Campbell
-- Lab 8: Start

-- 1. List comprehensions
pants = ["jeans", "khaki"];
tops = ["white shirt", "grey turtleneck", "pink polo", "green hoodie"];
shoes = ["brogues", "converse", "sandals"];
outfit = [ (a,b,c) | a <- pants, b <- tops, c <- shoes ]
-- this constructs 24 outfits
pants2 = ["jeans", "khaki", "skirt"]
pants3= ["jeans", "khaki", "skirt", "plaid"]
outfit2 = [ (a,b,c) | a <- pants2, b <- tops, c <- shoes ]
tops2 = ["white shirt", "grey turtleneck", "pink polo", "green hoodie", "purple sweater"]
tops3 = ["white shirt", "grey turtleneck", "pink polo", "green hoodie", "purple sweater", "black tank"]
outfits3 =  [ (a,b,c) | a <- pants, b <- tops2, c <- shoes ]
shoes2 = ["brogues", "converse", "sandals", "flip flops"]
shoes3 = ["brogues", "converse", "sandals", "flip flops", "tennis shoes"]
outfits4 = [ (a,b,c) | a <- pants, b <- tops, c <- shoes2 ]
outfits5=  [ (a,b,c) | a <- pants2, b <- tops, c <- shoes2 ]
outfits6=  [ (a,b,c) | a <- pants, b <- tops2, c <- shoes2 ]
outfits7=  [ (a,b,c) | a <- pants2, b <- tops2, c <- shoes ]
outfits8=  [ (a,b,c) | a <- pants3, b <- tops, c <- shoes ]
outfits9=  [ (a,b,c) | a <- pants, b <- tops3, c <- shoes ]
outfits10= [ (a,b,c) | a <- pants, b <- tops, c <- shoes3 ]
-- if you can only buy 2 items, you should either buy two pants or pants and shoes
-- both of these combinations lead to the maximum increase in outfits ( increase of 24)
scarves = ["paisley scarf", "knitloop"]
newOutfits = [ (a,b,c,d) | a <- pants, b <- tops, c <- shoes, d<-scarves]
-- There are now 48 outfits generated with the original lists of items


people = ["Mr.", "Ms.", "Mrs.", "Dr.", "Prof.", "Rev."]
--soloGuests = [ a | a<-people]
--coupleGuests = [a++ " and " ++b | a<-people, b<-people]
guests = [ a | a<-people] ++ [a++ "and " ++b | a<-people, b<-people]

natoAlph = [('A',"Alfa"), ('B',"Bravo"), ('C',"Charlie"), ('D',"Delta"), ('E',"Echo"),
 ('F',"Foxtrot"), ('G',"Golf"), ('H', "Hotel"), ('I', "India"), ('J', "Juliett"), 
 ('K', "Kilo"), ('L', "Lima"), ('M', "Mike"), ('N', "November"), ('O', "Oscar"), 
 ('P', "Papa"), ('Q', "Quebec"), ('R', "Romeo"), ('S', "Sierra"), ('T',"Tango"), 
 ('U',"Uniform"), ('V',"Victor"), ('W',"Whiskey"), ('X',"X-ray"), ('Y',"Yankee"),
  ('Z',"Zulu")]
translate word = [ snd y | x <- word, y<- natoAlph, x == fst y]

--2. Functions
remainder a b = a `mod` b 
isEven a = if a `mod` 2 ==0 then True else False
merge:: (Ord a) => [a] -> [a] -> [a]
merge (x:xs) (y:ys) = if x<y then (x:xs)++(y:ys) else (y:ys)++(x:xs)
removeMultiple:: [Integer] -> Integer-> [Integer] 
removeMultiple a b  = [ n | n<-a, (n `mod` b)/=0]
 
--3.List Functions
outfits:: [String]->[String]-> [String] -> [(String,String,String)]
outfits pants1 tops1 shoes1 =  [ (a,b,c) | a <- pants1, b <- tops1, c <- shoes1 ]
honorifics:: [String]->[String]
honorifics people = [ a | a<-people] ++ [a++ " and " ++b | a<-people, b<-people]
nato:: String-> [String]
nato wrd = [ snd y | x <- wrd, y<- natoAlph, x == fst y]
