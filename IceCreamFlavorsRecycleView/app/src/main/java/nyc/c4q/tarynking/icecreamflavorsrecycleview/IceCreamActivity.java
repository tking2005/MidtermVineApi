package nyc.c4q.tarynking.icecreamflavorsrecycleview;

/**
 * Created by tarynking on 10/11/16.
 */

public class IceCreamActivity {
}

///step 1. add recylcer view to xml
///step 2. put ID so when in java code can put an adapter.
///step 3. get reference using find view by ID.
///Step 4. set adapter and layout manager
///Step 5. Create adapter abstract class telling me I have to implement some methods
///Step 6. On create view holder creates view holder - called dependent on amount of data have and screen display size
///Step 7. make new ViewHolder in OnCreateView holder - passed into on bind view holder
///Step 8. onBindViewHolder is called everytime there is content on the screen the number of items that are currently on the screen
///Step 9. Create view in your ViewHolder class
///Step 10. Create layout for view holder..in this case LayoutInflater..returns a view
///Step 11. Each viewholder displays one piece of data at a time
// Step 12. Data goes in the View Holder...bind is called for data to be displayed
//Step 13 ViewHolder is a type...we make a subclass of viewholder
///Step 14. Bind method to bind the data and the view
//Step 15. in your OnBind view holder, Cast your viewholder back to what you know it is
