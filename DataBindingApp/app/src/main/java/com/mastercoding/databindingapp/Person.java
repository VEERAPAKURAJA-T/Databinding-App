package com.mastercoding.databindingapp;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
/*
Extending base observable is not strictly required, but it can be useful to implement automatic property
change notifications, especially when using add Bindable annotation and custom getters and setters
for properties in your ViewModel or data source.
And in this case the data source is the person class and extending base observable provides the notify
property change method which allows you to notify the data binding library when a property has changed.
 */
public class Person extends BaseObservable {

    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
/*
 To notify the data binding library when a property has changed.
This is essential for the library to automatically update UI elements when the underlying data changes.
For that, I'll use this Notify property changed method in the Setname method notify property change
and I need to use B-R.
This is from data binding library dot name.
So the notify property changed method is used in Android's data binding library to notify the library
that a specific property has changed its value.
The notification is crucial for two way data binding and as it informs the library to update any UI
elements bound to that property.
And this method is provided by base observable.
So we extend base observable to gain access to this method B stands for binding resources and it's a
generated class by the data binding library.
This class contains constant integer values associated with each of the bindable properties in your
data source.In other words, there is a constant for each property you've marked as bindable and you can see it
can't find name because if I go up I can't see any bindable annotation.
In order to solve this error, I'll add at bindable annotation here before the getName method, the
Bindable annotation is used to mark the user name here property observable, which tells data binding
to generate the necessary code to observe changes.
 */
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }
}
