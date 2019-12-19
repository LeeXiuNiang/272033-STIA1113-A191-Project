# Student Info
Lee Xiu Niang   (272033)  
Goh Yon Cing    (271510)  
Tey Peck Yong   (271147)  
Wong Carmen     (270262)  

# Introduction
This is a project about application of Pos Laju Malaysia. For your information, Pos Laju is one of the services under the management of Pos Malaysia. It is mainly about providing services such as next-day delivery, same-day delivery, selling prepaid boxes and envelopes and pos ekspress. 
This is a group project which completed by 4 members. By using classes and methods, coding of this project is distributed to 4 members.
Each classes have diffrent function. 4 classes are used for the services provided respectively, 1 class is used for the receipt and the last, Main, as the class which supports other classes.
So, there's 6 classes in this project and each class consist of methods.

# Pseuducode  

    Pseudocode for Main.main method

    Start  
      Declare variable nddTotal = 0, sddTotal = 0, pbTotal = 0, peTotal = 0  
	    Call method choice ()  
    End  

    Pseudocode for Main.showMainMenu () method

    Start
	    Output “Welcome to Pos Laju Malaysia.”
	    Output “ ~~~~~~~~~~Main Menu~~~~~~~~~~”
	    Output “ 1. Next-Day Delivery”
	    Output “ 2. Same-Day Delivery”
	    Output “ 3. Prepaid Box & Envelope”
	    Output “ 4. Pos Ekspres”
	    Output “ 5. Receipt”
	    Output “ 0. Quit”
	    Output “~~~~~~~~~~~~~~~~~~~~~~~~~~~~~”
    END

    Pseudocode for Main.choice () method

    Start
	    Declare choice equal to negative one
	    WHILE choice not equal to zero THEN
		    Call method showMainMenu()
		    Output "Please enter your choice: "
	    Prompt user to input choice
		    Input choice
		    WHILE choice less than zero or choice greater than five
			    Output "Invalid selection"
			    Output "Please enter your choice: "
			    Input choice
			    END WHILE
				    IF choice is equal to one THEN
					    nddTotal is equal to nddTotal + NextDayDelivery.output()
				    ELSE IF choice is equal to two
					    sddTotal is equal to sddTotal + SameDayDelivery.output()
				    ELSE IF choice is equal to three
					    pbTotal is equal to pbTotal + Prepaid_BoxEnvelope.output()
				    ELSE IF choice is equal to four
					    peTotal is equal to peTotal + PosEkspres.output()
				    ELSE IF choice is equal to five
	    Call method Receipt.display(nddTotal, sddTotal, pbTotal, peTotal)
				    END IF
    END

    Psuedocosde for NextDayDelivery Class

    Start
	    Declare variable for choice, package type, document’s zone, parcel’s zone, total price
	    Initialize total price to 0 and int to 0
	    Output "Do you want Next-Day Delivery?" + "\n" + "1 Yes" + "\n" + "2 No"
	    Input choice
	    WHILE choice is less than 1 or more than 2
		    Output "Please enter valid choice 1 or 2."
		    Input choice
	    ENDWHILE
	    IF choice is equal to 1 THEN
	    Output "Enter your package type:" + "\n" + "1 Document(below 2kg)" + "\n" + "2 Parcel(above 2kg)"
	    Input package type
		    WHILE package type is less than 1 or more than 2
			    Output "Please enter valid choice 1 or 2."
			    Input package type
		    ENDWHILE
	    CASE package type
		    1: Output "Enter your document's zone:" + "\n" + "1 Zone 1" + "\n" + "2 Zone 2" + "\n" + "3 Zone 3" + "\n" + "4 Zone 4" + "\n" + "5 Zone 5"
		    Input document’s zone
		    WHILE document’s zone is less than 1 or more than 5
			    Output "Please enter valid zone within 1-5."
			    Input document’s zone
		    ENDWHILE
		    CASE document’s zone
		    1: total=CALL document method (4.90,0.80)
		    2: total=CALL document method (5.40,1.00)
		    3: total=CALL document method (6.90,1.50)
	    	4: total=CALL document method (7.40,1.50)
		    5: total=CALL document method (7.90,2.00)
		    ENDCASE
	
		    2: Output “Enter your parcel's zone:" + "\n" + "1 Zone 1" + "\n" + "2 Zone 2" + "\n" + "3 Zone 3" + "\n" + "4 Zone 4" + "\n" + "5 Zone 5"
		    Input parcel’s zone
		    WHILE parcel’s zone is less than 1 or more than 5
			    Output "Please enter valid zone within 1-5."
			    Input parcel’s zone
	    	ENDWHILE
		    CASE parcel’s zone
		    1: total=CALL parcel method (10.50,0.50)
	    	2: total=CALL parcel method (16.00,2.00)
	    	3: total=CALL parcel method (21.00,3.00)
		    4: total=CALL parcel method (26.00,3.50)
	    	5: total=CALL parcel method (31.00,4.00)
	    	ENDCASE
    	ENDCASE
    	WHILE choice is equal to 1
	    Declare variable for array, int
	    Initialize int to 0
	    Output "Do you want more transactions?" + "\n" + "1 Yes" + "\n" + "2 No"
    	Input choice
	    WHILE choice is less than 1 or more than 2
		    Output "Please enter valid choice 1 or 2."
	    	Input choice
	    ENDWHILE
	    ENDWHILE
	    Calculate total price+=array[int]
	    Output total price

	    ELSE
	    ENDIF
    End

    NextDayDelivery.Document’s method (first document price, subsequent document price)

    Start
	    Output "Enter the document's weight in g: "
	    Input document's weight
    	WHILE document's weight is less than 0 or more than 2000g
	    	Output "Please enter valid document's weight below 2000g.”
	    	Input document's weight
    	ENDWHILE
	    IF document's weight is less than 500 THEN
		    total subsequent document price=0
	    ELSE
		    Calculate int = (document’s weight / 1000 - 0.5) / 0.25
	    	IF (document's weight/1000-0.5)%0.25 equals to 0 THEN
			    Calculate total subsequent document price=int*subsequent document price
		
		    ELSE
		    	Calculate total subsequent document price=(int+1)*subsequent document price
		
	    	ENDIF
	    ENDIF
	    Calculate document price = first document price+ total subsequent document price
	    Output document price
	    Return document price
    End
    
     NextDayDelivery.Parcel’s method (first parcel price, subsequent parcel price)
    
    Start
    	Output "Enter the parcel's weight in kg: " 
    	Input parcel's weight
	    WHILE parcel’s weight is less than 2.001kg
	    	Output "Please enter valid parcel's weight above 2.001kg."
	    	Input parcel's weight
    	ENDWHILE
	    IF parcel's weight is more than 2.001kg and less than 2.5kg THEN
		    total subsequent parcel price=0
    	ELSE
		    Calculate int = parcel’s weight - 2.5) / 0.5
	    	IF (parcel’s weight - 2.5) % 0.5 is equal to 0 THEN
		    	Calculate total subsequent parcel price=int*subsequent parcel price
		
	    	ELSE
			    Calculate total subsequent parcel price=(int+1)*subsequent parcel price
		
		    ENDIF
	    ENDIF
	    Calculate parcel price = first parcel price+ total subsequent parcel price
    	Output parcel price
    	Return parcel price
    End

    Pseudocode for SameDayDelivery.output () method

    Start
	    Call method table()
	    Call method questionB()
	    Call method array()
    End
    
    Pseudocode for SameDayDelivery.table () method
    
    Start
	    Display Table
    End

    Pseudocode for SameDayDelivery.questionB () method

    Start
	    Output “Which town you want to delivery?”
	    Output “1. Local Town”
	    Output “2. Cross Town”
	    Prompt user to input 1 or 2
	    Input my
	    Switch (my)
	    IF my is equal to 1 THEN
		    Call method questionC ()
		    Break
	    IF my is equal to 2 THEN
		    Call method questionD()
		    Break
	    Default
		    Output "Invalid. Please enter 1 or 2."
		    Call method questionB () for user to input valid input
	    END IF
    END

    Pseudocode for SameDayDelivery.questionC () method

    Start
	    Output “What is your shipment weight(gm)?”
	    Prompt user to input valid weight
	    Input my
      Declare price = 0
	    Declare doCharge = 4.90
	    Declare surcharge = 6.00
	    IF my is greater than zero and my is less than five hundred THEN
		    Count total with formula doCharge + surcharge
	    ELSE IF my is greater than or equal to 500 and my is less than seven hundred and fifty THEN
	    	Count total with formula (doCharge +0.8) + surcharge
	    ELSE IF my is greater than or equal to seven hundred and fifty and my is less than or equal to one thousand THEN
	    	Count total with formula (doCharge +1.6) + surcharge
	    ELSE 
	    	Output "Invalid. Please enter valid weight (> 0 to <= 1000)."
	    	Call method questionC () for user to input valid input
    	END IF
	    Output "Your Same-Day Delivery: RM” + price
    	Count total to equal total + price
    END

    Pseudocode for SameDayDelivery.questionD () method

    Start
	    Output “What is your shipment weight(gm)?”
	    Prompt user to input valid weight
	    Input my
    	Declare price = 0 
	    Declare doCharge = 5.40
    	Declare surcharge = 7.50
	    IF my is greater than zero and my is less than five hundred THEN
	    	Count total with formula doCharge + surcharge
	    ELSE IF my is greater than or equal to 500 and my is less than seven hundred and fifty THEN
		    Count total with formula (doCharge +1) + surcharge
	    ELSE IF my is greater than or equal to seven hundred and fifty and my is less than or equal to one thousand THEN
		    Count total with formula (doCharge +2) + surcharge
	    ELSE 
	    	Output "Invalid. Please enter valid weight (> 0 to <= 1000)."
	    	Call method questionD () for user to input valid input
	    END IF
	    Output "Your Same-Day Delivery: RM” + price
	    Count total equal to total + price
    END

    Pseudocode for SameDayDelivery.array () method
    
    Start
	    Output “Do you need another Same-Day Delivery?”
	    Output “1. Yes”
	    Output “2. No”
	    Prompt user to input 1 or 2
	    Input my
	    Switch (my)
	    IF my is equal to 1 THEN
	    WHILE my equal to one THEN	
    	Call method questionB ()
    	Output “Do you need another Same-Day Delivery?”
    	Output “1. Yes”
    	Output “2. No”
    	Prompt user to input 1 or 2
     	END WHILE
    	IF my is equal to 2 THEN
	    WHILE my equal to two THEN	
	    	Output "Your Same-Day Delivery: RM” + total
    	Break
    	END WHILE
    	Break
    	Default
    	WHILE my not equal to one or my not equal to two THEN
	    	Output "Invalid. Please enter 1 or 2."
	    	Call method array ()
    	END WHILE
    	END IF
    	Return total
    END
    
    Pseudocode for Prepaid_BoxEnvelope.output() Method
    
    Start
	    Show table
	    display output
	    Output"Do you want to continue Prepaid Box & Envelope? (Y/N)"
	    Input choice
	    Output"Total price of prepaid box"
	    return total
    
    End
    
    Psuedocosde for Prepaid_BoxEnvelope.showTable(typeArray,sizeArray,weightArray,priceArray) Method
    
    Start
	    Output Table
    End

    Pseudocode for Prepaid_BoxEnvelope.promptWeight() method
    
    Start
    	Input weight
	    Loop input of weight if weight is negative value or more than 10kg
	    IF weight <=0.5kg, then selection = 0
    	IF weight <=1kg, then selection = 1
	    IF weight <= 2kg, then selection = 2
    	IF weight <= 5kg, then selection = 3
    	IF weight <= 10kg, then selection = 4
    
    	return selection
    END
    
    Pseudocode for Prepaid_BoxEnvelope.displayOutput()method
    
    Start
    	Display output
    	Output"No of package type"
	    Output"Type of package"
	    Output"Max weight"
    	Output"Price"
    End
    
    Psuedocosde for PosEkspress.showMenu() Method
    
    Start
    	Output Menu
    End

    
    Psuedocosde for PosEkspress.calculatePrice() Method
    
    Start
	    Input weight
	    Loop input of weight if weight less than 0 or more than 1000
	    Input quantity
	    Loop input of quantity if quantity less than 1
    
	    IF weight>0 and weight<=100
	    	THEN price = 3.18*quantity
    	ELSE IF Weight>100 and weight<= 250
	    	THEN price = 3.71*quantity
    	ELSE IF weight>250 and weight<= 500
	    	THEN price = 4.77*quantity
	    ELSE IF weight>500 and weight<= 1000
		    THEN price = 7.42*quantity
	    
	    Call method calculateTotalPrice(price)
    End
    
    Psuedocosde for PosEkspress.calculateTotalPrice(price) Method
    
    Start
    	Calculate totalPrice = totalPrice + price
    End
    
    Psuedocosde for PosEkspress.output() Method
    
    Start
	    Call method showMenu()
	    Call method calculatePrice()
	    Output price
	    Output "Press any number to continue, 0 to main page:"
	    Input Choice
	    Loop if Choice not equal to 0
    	{
		    Call method showMenu()
		    Call method calculatePrice()
		    Output price
		    Output "Press any number to continue, 0 to main page:"
		    Input Choice
	    }
	    End Loop if Choice equal to 0
    	Call method calculateTotalPrice(price)
	    Output Total Price
    End
    
    Pseudocode for Receipt.Display() method
    
    Start
    	Display (parameters: nddTotal, sddTotal, pbTotal, peTotal)
    	Total is equal to nddTotal + sddTotal + pbTotal + peTotal
    	Output “Receipt”
    	Output "Next Day Delivery: ","RM", nddTotal
      Output "Same Day Delivery: ","RM", sddTotal
      Output " Prepaid Box & Envelope: ","RM", pbTotal
      Output " Pos Ekspres: ","RM", peTotal
      Output “------------------------------------"
      Output “Total Price: “, “RM”, total
      Output “------------------------------------"
      Output “Thank You!”
    END
    
# Flowchart
![Main_FlowChart1](/Main_FlowChart1.png)
![NextDayDelivery_FlowChart](/NextDayDelivery_FlowChart.png)
![SameDayDelivery_FlowChart](/SameDayDelivery_FlowChart.png)
![Prepaid_BoxEnvelope_FlowChart](/Prepaid_BoxEnvelope_FlowChart.png)
![PosEkspress_FlowChar](/PosEkspress_FlowChart.png)
![Receipt_FlowChart](/Receipt_FlowChart.png)

# Screenshot of the output
![Output1](/Output1.png)
![Output2](/Output2.png)
![Output3](/Output3.png)
![Output4](/Output4.png)
![Output5](/Output5.png)
![Output6](/Output6.png)
![Output7](/Output7.png)
![Output8](/Output8.png)
![Output9](/Output10.png)
