# WESTERN GOVERNORS UNIVERSITY
## D287 – JAVA FRAMEWORKS

## Emily's Notes:
A. I cloned the repository to my local file and uploaded to IntelliJ

B. I added the README2.md file

C.-mainscreen.html Added the shop name "Emily's Wagons", product name "Wagons", and product parts "Wagon Body", "Wagon Wheels", and "Handle".
Line: 20
mainscreen.html
lines 15-20
added style to page buttons
D. -templates created About.html stating the company mission and added a link to the mainscreen.html
    created AboutController.java
    added @getMapping to AboutController.java
     added nav to mainscreen.html line 21-  26

E. -BootStrapData added objects to repositories
   Outsourced PartRepository / Inhouse Part repository
line: 62-154
parts: price: Inventory: ID:
Wheels 3.50	5 1300
Handle 4.50	5	1301
Bottom 3.50    5 1302
Front  3.50 	5 1303
Back   3.50	5     1304
Sides  3.50	5	 1305

ProductRepository
Products:
Blue Wagon 30.50
Green Wagon 30.50
Red Wagon 30.50
Blue Wagon Small 25
Green Wagon Small 25
Red Wagon Small 25

-change database in application properties and refresh

F. -mainscreen.html Added the Buy Now! button to the product table - lines:103-104
    created BuyNowController.java to decrement after purchase 
    created PurchaseSuccess.html to produce purchase success message
    created outOfStock.html to produce out of stock message 

G.  - bootstrapdata.java
lines 65-188
   added the part.setMinInv(1)
    added part.setMaxInv(5)
Line 144
   added:partRepository.saveAll(inHousePart);
    -InhousePart.java
Lines 18-19
    added min and max inventory values
    -OutsourcedPart.java
lines 18-19
    added min and max inventory values
   -Part.java
Lines 32-26
    added @Min @Max annotations and set message
Lines 58-59 
    set default values for min and max values
Create Validators: ValidMax.java, MaximumValidator.java, 

-inHousePartForm 
    Lines 24-28 add input error forms for min and max values
-outsourcedPartform
    Lines 24-28 add input error forms for min and max values

H. 
-Part.java
Lines 32-26
    added @Min @Max annotations and set message
Lines 58-59
    set default values for min and max values
Lines 124-143
    added checkInventory methods to ensure the inventory does not fall below min or go above max. 

-EnufPartsValidator
Line 36-39
    added if statement to return false if inventory is below minimum.

-AddInHousePartController.java
Lines 42-52
    added 3 If statements for checkInventory, if inv is over max = error message,
    if inventory is below min = error message.

-AddOutsourcedPartController.java
Lines 42-52
    added 3 If statements for checkInventory, if inv is over max = error message,
    if inventory is below min = error message.

--updated database name

I. -Parttest.java 
Lines 159-186 
added two J unit test methods GetAndSetMin  & GetAndSetMax

//remove unused code from InHousePart.java
//remove  unused code from outsourcedpart.java
//delete extra validators that are unused





  

