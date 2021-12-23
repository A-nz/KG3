package ru.vsu.cs.kg2021.g41.petrov_a_a.kg3.DrawObject;

import ru.vsu.cs.kg2021.g41.petrov_a_a.kg3.DrawUtils;
import ru.vsu.cs.kg2021.g41.petrov_a_a.kg3.RealPoint;
import ru.vsu.cs.kg2021.g41.petrov_a_a.kg3.ScreenConverter;
import ru.vsu.cs.kg2021.g41.petrov_a_a.kg3.ScreenPoint;

import java.awt.*;

public class Text implements Drawing {
    private final String text;
    private final RealPoint realCoordinates;
    private final Font font;

    public Text(String text, Font font, RealPoint realCoordinates) {
        this.text = text;
        this.realCoordinates = realCoordinates;
        this.font = font;
    }

    @Override
    public void draw(Graphics2D graphics2D, ScreenConverter screenConverter) {
        DrawUtils.drawWithFont(graphics2D, this.font, () -> {
            ScreenPoint screenCoordinates = screenConverter.convertRealToScreen(this.realCoordinates);
            graphics2D.drawString(this.text, screenCoordinates.getX(), screenCoordinates.getY());
        });
    }
}
