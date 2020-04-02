// PhotoAlbum.cs
// kbrleson
// COMP 4040

using System;
namespace Question_1
{
    // Create a class "PhotoAlbum"
    public class PhotoAlbum
    {
        // private attribute "numberOfPages." 
        private int numberOfPages;

        // The default constructor will create an album with 16 pages. 
        public PhotoAlbum()
        {
            this.numberOfPages = 16;
        }

        // There will be an additional constructor, with which we can specify the number of pages we want in the album. 
        public PhotoAlbum(int numberOfPages)
        {
            this.numberOfPages = numberOfPages;
        }

        // It should also have a public method "GetNumberOfPages", which will return the number of pages. 
        public int GetNumberOfPages()
        {
            return this.numberOfPages;
        }
    }
}
