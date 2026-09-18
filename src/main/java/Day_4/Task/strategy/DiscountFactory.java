package Day_4.Task.strategy;

import Day_4.Task.model.CustomerType;

import java.util.EnumMap;
import java.util.Map;

public class DiscountFactory {
    private static final Map<CustomerType, DiscountStrategy> strategies = new EnumMap<>(CustomerType.class);

    static {
        strategies.put(CustomerType.REGULAR, new RegularDiscount());
        strategies.put(CustomerType.MEMBER, new MemberDiscount());
        strategies.put(CustomerType.VIP, new VIPDiscount());
    }

    public static DiscountStrategy getStrategy(CustomerType type) {
        return strategies.getOrDefault(type, new RegularDiscount());
    }
}

