package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class DragAndDrop {
    @Test
            void DragAndDropSquares () {
        //открыть страницу Drag and Drop
        open ("https://the-internet.herokuapp.com/drag_and_drop");
        //переташить квадрат "А" на квадрат "В"
        $("#column-a").dragAndDropTo("#column-b");
        //Проверить поменялись ли они местами
        $(".column").shouldHave(Condition.text("B"));
        //Дочерний элемент должен содержать "А"
        $(".column").sibling(0).shouldHave(Condition.text("A"));




    }
}
