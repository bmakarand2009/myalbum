class BootStrap {

     def init = { servletContext ->
         def jb = new Artist(name:'Jeff Beck')
         def bbb = new Album(title:'Blow By Blow')
         
         bbb.addToTracks(name:'Freeway Jam')
         bbb.addToTracks(name:'Thelonius')
         
         jb.addToAlbums(bbb)
         
         def wir = new Album(title:'Wired')
         wir.addToTracks(name:'Sophie')
         
         jb.addToAlbums(wir)
         
         jb.save()
     }
     def destroy = {
     }
} 