# Synopsis
In this project, we are going to build an order management system for a mobile phone retailer. A new register and login screen will be needed. Once the user logs in to the system, we will redirect the user to the “User Shopping Screen” where available device models will be displayed. After the user selects his/her desired model, we will redirect the user to the “Selected Offer Page”, where the user can choose available options for their desired model. The options includes, storage capacity, color and display size (6.1 inch, 6.7 inch, etc.). Options may differ from model to model.

The system may contain admin users, who will be able to create orders for other users. The system may include exclusive device models, which will be only sold via Admin user.

*The models and options (storage, color etc.) of the devices will be provided as an Excel File.

# Project Structure
-Briefly, the project is a small order management system. The main requirements are fallows

there should be at least 2 user types. (admin, user)

there should be at least 5 offers to display. (prod and service/resource specs should be present for offers - EMRE)

there should be at least 3 offer char attached to the related offer. (We can differentiate characteristics according to the difficulty level. It would be good to introduce orderChars and OfferInstance chars)

After a user login with the help of the login page, the system shall direct them according to their user type. (maybe admin user updates the offers, and the general user just create the offer we can discuss it) (We can integrate role_perms in two alternative ways. The first one is to create ui_view’s to create segments in the screen, which will go together with FE. For an alternative, we may create “exclusive offers” specific to admin)

A user shall see & select all the defined offers. (Maybe two catalogs can be created to include different offers)

A user shall enter the offer char information. Validations shall be executed. (We can create dropdown menus to offer chars/ colors for example )

After all the related information is fulfilled correctly, the user shall push a button to buy the desired offer, and quote like JSON objects have to be created.

# Backend Scope
![image](https://user-images.githubusercontent.com/30628100/186343298-4a5c26d2-4910-48c4-aae2-7ff0f6fd581a.png)


![image](https://user-images.githubusercontent.com/30628100/186343369-68b12807-9526-408f-a326-dcfb0cd0d239.png)

![image](https://user-images.githubusercontent.com/30628100/186343410-e66779c3-df37-4007-9dc6-a33138713fca.png)

![image](https://user-images.githubusercontent.com/30628100/186343446-25c9ddcc-454e-4885-a310-eb5c06f74b05.png)

![image](https://user-images.githubusercontent.com/30628100/186343740-bd4b084d-2b46-479b-8864-ada6b03c9932.png)

![image](https://user-images.githubusercontent.com/30628100/186344093-fbdbeebf-e83c-4530-8b11-2c4d16d634f8.png)



All backend codes must be validated with appropriate unit test classes.
