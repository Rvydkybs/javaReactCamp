import react from "react";
import axios from "axios";
import React from 'react';

class UserSignUpPage extends react.Component{
    state={//uygulamanın son güncel durumunu tutarız
        username:null,
        agreedClick:false,
        displayName:null,
        password:null
    };
    onChange=event=>{
        const value=event.target.value;
        const field=event.target.name;
        this.setState({
            [field]:value
        })
    };
    onClickSignUp=event=>{
       
        event.preventDefault();
        const body={//kullanacağı body'i biz tanımladık-body objesi oluşturduk
            username:this.state.username,//bu objeyi axios ile backende gönder
            displayName:this.state.displayName,
            password:this.state.password
        }
        axios.post("/api/1.0/users",body);//butona tıkladığımızda gideceği url ve kullanacağı body->
        //backende'e @CrossOrigin ekleyince 3000 ve 8080 bağlanabildi.labellara girdiğimiz değerler buttona basınca backende gönderildi!
    }
    //YUKARIDA TEK BİR OCHANGE OLMADAN ÖNCE BU KISIMLAR DURUYORDU!!!!!
    // onChangeUserName = event=>{ //fonksiyonun diğer tanımlanışı/event alan bir fonk
    //     this.setState({//JSON objesi -state'nin değiştiğini reacte haber veriyoruz ve buna göre class tekrar render ediliyor
    //         username: event.target.value
    //     });
    // };
   
    // onChangeDisplayName=event=>{
    //      this.setState({
    //          displayName:event.target.value
    //      });
    // };
    // onChangePassword=event=>{
    //      this.setState({
    //          password:event.target.value
    //      });
    // }
    render(){//override edilecek method     
        return(
            <form>
                <h1>Sign Up</h1>
                <div>
                    <lable>User name</lable>
                    <input name="username" onChange={this.onChange}></input>
                </div>
                <div>
                    <lable>Display name</lable>
                    <input name="displayName" onChange={this.onChange}></input>
                </div>
                <div>
                    <lable>Password</lable>
                    <input name="password" type="password" onChange={this.onChange}></input>
                </div>
                <div>
                   
                    <button onClick={this.onClickSignUp}>Sign Up</button>
                </div>
            </form>
            
        );
    }
}
export default UserSignUpPage;