
    import java.awt.Color;
    import java.awt.Font;
    import java.awt.Graphics;
    
    public class GraphicString {
    
        private char character;
        private int size;
        private int posX;
        private int posY;
        private Color color;
        private Font font;
    
        public GraphicString(char character, int size, int posX, int posY) {

            this.character = character;
            this.size = size;
            this.posX = posX;
            this.posY = posY;
            this.color = Color.BLACK;
            this.font = new Font("Arial", Font.PLAIN, size);
           
        }
    
        public void draw(Graphics g) {
            g.setColor(color);
            g.setFont(font);
            g.drawString(String.valueOf(character), posX, posY);
        }

    
        public void setColor(Color color) {
            this.color = color;
        }
    
        public void setFont(Font font) {
            this.font = font;
        }

    }


