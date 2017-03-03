# polymer-java-mapping
Polymer-Java Mapper simply maps the front-end module written by Polymer with Java back-end. Metaworks3 framework works for metadata synchronization and remote procedure call between the front and back-end module.

## Example

### front-end module
```
<dom-module id="uengine-login">
  <template>
    <style>
      :host {
        display: block;
      }
    </style>
    <paper-input label="Name" id="name" value={{name}}></paper-input>
    <paper-input label="Password" id="password" value={{password}} type="password"></paper-input>
    <iron-label>{{message}}</iron-label>

    <paper-button id="login-button" on-tap="_login" raised>Login</paper-button>
  </template>

  <script>
    mw3.Polymer({
      is: 'uengine-login',
      java: 'org.uengine.Login'
    });
  </script>
</dom-module>
```

### back-end module
```
public class Login {

	String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	String message;
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	String password;
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
	@ServiceMethod(callByContent=true)
	public Object login(){
		
		if(getName().equals(getPassword())){
			return new Main(this);
		}else{
			setMessage("Wrong Password for " + getName() + ".");

			return this;
		}

	}
	
}
```

## Benefit

1. You don't need to re-define and synchronize the definition of properties and functions for the model.
1. Encourages a model-driven (domain driven) development.
1. If your back-end is almost written in Java, it excels the development speed.

## Document

1. [Wiki](https://github.com/TheOpenCloudEngine/polymer-java-mapping/wiki)
1. [Metaworks3](https://github.com/TheOpenCloudEngine/metaworks)
1. [Polymer](https://www.polymer-project.org)
