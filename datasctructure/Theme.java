package com.example.michael.datastructure.datasctructure;

import com.example.michael.datastructure.utilities.notificationsystem.Publisher;
import com.example.michael.datastructure.utilities.notificationsystem.SystemMessage;

import java.util.List;
import java.util.Map;

/**
 * Class describes a single theme. A theme is on a very
 * basic level is a collection of light bulbs with assigned
 * traits.A theme can also contain another themes or
 * collection of themes and light bubs.
 *
 *
 */
public class Theme extends HueElement
{
    private static int NEXT_THEME_ID = 0;

    Map<Lightbulb,Trait> _theme;
    List<Theme> _collection;
    boolean _activated;

    /**
     * Sets next theme id.
     * @param nextId - next id
     */
    public static void nextThemeIdInit(int nextId)
    {
        assert (nextId > NEXT_THEME_ID);
        if(nextId < 1)
            throw new IllegalArgumentException("Cant initialize nexttheme id counter");
        NEXT_THEME_ID = nextId;
    }

    /**
     * Constructs an empty theme.
     * @param name - list of bulbs with assigned traits
     */
    public Theme(String name)
    {
        super(NEXT_THEME_ID, name);
        subscribe(Publisher.UPDATE_THEME);
        NEXT_THEME_ID++;
    }


    /**
     * Constructs a theme with specified id, name a and a list of bulbs with
     * @param id - id of a theme
     * @param name - name of the theme
     * @param theme - list of bulbs with assigned traits.
     * @throws {@link IllegalArgumentException} if theme == null or contain nulls
     */
    public Theme(int id, String name, Map<Lightbulb, Trait> theme)
    {
        this(id, name);
        if(theme == null || theme.containsKey(null) || theme.containsValue(null))
            throw new IllegalArgumentException("Can't create theme due to incorrect argument");

        _theme = theme;
        _activated = true;

    }

    /**
     * Constructs a theme from specified theme.
     * @param id - theme id
     * @param name - name of the theme
     * @param theme - specified theme that is used to create a new theme.
     */
    public Theme(int id, String name, Theme theme)
    {
        super(id,name);
        //TODO: Write implementation
    }

    public Theme(int id, String name, List<Theme> collection)
    {
        super(id, name);
        //TODO: Write implementation
    }

    public Theme(int id, String name, Map<Lightbulb, Trait> theme, List<Theme> collection, )
    {
        super(id, name);
        //TODO: Write implementation
    }

    public boolean isActivated()
    {
        return _activated;
    }

    public void activate()
    {
        _activated = true;
    }

    public void deactivate()
    {
        _activated = false;
    }

    public boolean addTheme(Theme theme)
    {
        //TODO: Write implementation
        return true;
    }

    public Theme removeTheme(int themeId)
    {
        //TODO: Write implementation
        return null;
    }

    public List<Theme> removeAll()
    {
        //TODO: Write implementation
        return null;
    }

    public int themeCount()
    {
        //TODO: Write implementation
        return 0;
    }

    public boolean addBulb(Lightbulb bulb, Trait trait)
    {
        //TODO: Write implementation
        return true;
    }

    public boolean addBulbs(Map<Lightbulb,Trait> bulbs)
    {
        //TODO: Write implementation
        return true;
    }











    @Override
    public void onNotify(SystemMessage message)
    {
        int id = message.getId();
        switch(id)
        {
            case Publisher.UPDATE_THEME:
                break;
        }
    }
}
