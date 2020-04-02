// AlbumTest.cs
// kbrleson
// COMP 4040

using System;
namespace Question_1
{
    // Create a test class "AlbumTest" 
    public class AlbumTest
    {
        static void Main(string[] args)
        {
            // create an album with its default constructor
            PhotoAlbum photoAlbum1 = new PhotoAlbum();

            // one with 24 pages
            PhotoAlbum photoAlbum2 = new PhotoAlbum(24);

            // a "BigPhotoAlbum" 
            BigPhotoAlbum bigPhotoAlbum = new BigPhotoAlbum();

            // show the number of pages that the three albums have.
            Console.WriteLine("photoAlbum1 numberOfPages:" + photoAlbum1.GetNumberOfPages());
            Console.WriteLine("photoAlbum2 numberOfPages:" + photoAlbum2.GetNumberOfPages());
            Console.WriteLine("bigPhotoAlbum numberOfPages:" + bigPhotoAlbum.GetNumberOfPages());
        }
    }
}
